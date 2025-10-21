package stacksandqueues;

class TwoStacksGFG {
    int size;
    int top1;
    int top2;
    int arr[];
    TwoStacksGFG() {
      size=100;
      arr=new int[size];
      top1=-1;
      top2=size;
    }
    void push1(int x) {

         if (top1 + 1 == top2) {
            
            return;
        }
        arr[++top1] = x;
        
    }
    void push2(int x) {
         if (top1 + 1 == top2) {
            
            return;
        }
        arr[--top2] = x;
    }
        
    int pop1() {
        if (top1 == -1) {
            return -1; 
        }
        return arr[top1--];
    }
    int pop2() {
                if (top2 == size) {
            return -1; 
        }
        return arr[top2++];
    
    }
}

