package stacksandqueues;

public class KQueues {
    int[] arr,front,rear,next;
    int free;

    KQueues(int n, int k) {
        arr=new int[n];
        front=new int[k];
        rear=new int[k];
        next=new int[n];
        for(int i=0;i<k;i++){
            front[i]=-1;
            rear[i]=-1;
        }
        for(int i=0;i<n-1;i++){
            next[i]=i+1;
        }
        next[n-1]=-1;
        free=0;
    }

    void enqueue(int x, int i) {
        if(isFull()) return;
        int ins=free;
        free=next[free];
        if(front[i]==-1) front[i]=ins;
        else next[rear[i]]=ins;
        next[ins]=-1;
        rear[i]=ins;
        arr[ins]=x;
    }

    int dequeue(int i) {
        if (isEmpty(i)) {
            return -1;
        }

        int frontIndex = front[i];
        front[i] = next[frontIndex]; 

        if (front[i] == -1)          
            rear[i] = -1;

        next[frontIndex] = free;  
        free = frontIndex;

        return arr[frontIndex];
    }

    boolean isEmpty(int i) {
        return front[i]==-1;
    }

    boolean isFull() {
        return free==-1;
    }
}

