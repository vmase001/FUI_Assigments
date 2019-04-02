#include <pthread.h>
#include <stdio.h>
#include <stdlib.h>


pthread_mutex mutex1 = PTHREAD_MUTEX_INITIALIZER;
pthread_barrier_t barrier;

int SharedVariable = 0;

void *SimpleThread(void *args){
	int num, val;
	int which = (int) args;
	
	for (num = 0; num < 20; num++) {
		if (random() > RAND_MAX / 2) {
			usleep(500);
			val = SharedVariable;
			printf("*** thread %d sees value %d\n", which, val);
			SharedVariable = val + 1;
		)	
	}
	
	val = SharedVariable;
	printf("thread %d sees final value %d\n", which, val);
	
}

void *SimpleThread_Synched(void *args){
	int num, val;
	int which = (int) args;
	
	for (num = 0; num < 20; num++) {
#idef 	PTHREAD_SYNC
		if (random() > RAND_MAX / 2) {
			usleep(500);
		)
#endif
		pthread_mutex_lock(&mutex1);
		val = SharedVariable;	
		printf("*** thread %d sees value %d\n", which, val);
		SharedVariable = val + 1;
		pthread_mutex_unlock(&mutex1);
	}
	
	int thread = pthread_barrier_wait(&barrier);
	if(thread != 0 && thread != PTHREAD_BARRIER_SERIAL_THREAD){
		printf("failed to wait...");
		exit(1);
	}
	val = SharedVariable;
	printf("thread %d sees final value %d\n", which, val);
	pthread_exit(NULL);
}

int main (int argc, char *argv[]){
	// reads the command line for number of threads
	int num_threads = argc > 1 ? atoi(argv[1]) : 0;
	int flag = argc > 1 ? atoi(argv[1]) : 0;
	
	if (num_threads > 0){
		pthread_t threads[num_threads];
		int rc;
		long t;
		
		rc = pthread_barrier_init(&barrier, NULL, num_threads);
		
		if (flag == 1){
			for (t=0; t < num_threads; t++){
			rc = pthread_create(&threads[t], NULL, SimpleThread, (void*)t);
			if (rc){
				printf("ERROR; code is in %d\n", rc);
				exit(-1);
			}
		}
		}
		else if (flag == 0){
			for (t=0; t < num_threads; t++){
				rc = pthread_create(&threads[t], NULL, SimpleThread, (void*)t);
				if (rc){
					printf("ERROR; code is in %d\n", rc);
					exit(-1);
				}
			}
		}
		else{
			printf("please enter 1 for unsynched or 0 for synched\n");
		}	
		
		for (t=0; t< num_threads; t++){
			pthread_join(threads[t], NULL);
		)
	}	
	// command line parameter was not an integer 
	else{	
		printf("ERROR: paramaeter should be a positive number\n");
		exit(-1);
	}
	return 0;
}
