#include<stdio.h>
// enter an array
void enterElement(int*arr,int n){
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
}
// print an array
void printArray(int* arr,int n){
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
}
// average of students
int averageStudent(int* arr,int n){
    int average =0;
    for(int i=0;i<n;i++){
        average+=arr[i];

    }
    average=average/n;
    return average;
}
// find the highest and lowest score
int highestScore(int* arr,int n){
    int temp=0;// Since score is always 0
    for(int i=0;i<n;i++){
        if(temp<arr[i]){
            temp=arr[i];
        }
    }printf("%d\n",temp);

    for(int i=0;i<n;i++){
        if(arr[i]==temp){
            return i;
        }
    }
}
int LowestScore(int *arr,int n){
    int temp=__INT_MAX__;
    for(int i=0;i<n;i++){
        if(temp>arr[i]){
          temp=arr[i];  
        }
    }
    for(int i=0;i<n;i++){
        if(temp==arr[i]){
            return i;
        }
    }
}
// changing score at particular index
void changeScore(int* arr,int n,int newscore){
    arr[n]=newscore;
}

void delete(int* arr,int n,int ele){
    int index=0;
    for(int i=0;i<n;i++){
        if(arr[i]==ele){
            index=i;
            break;
        }
    }
    for(int i=index;i<n-1;i++){
        arr[i]=arr[i+1];
    }
    arr[n-1]=0;
}
int main(){
    int n;
    printf("Enter the number of students : ");
    scanf("%d",&n);
    int a[n];
    enterElement(a,n);
    // printf("Highest Score Index : %d\n",highestScore(a,n));
    // printf("Lowest Score Index : %d\n",LowestScore(a,n));
    delete(a,n,4);

    // printf("average :%d\n",averageStudent(a,n));    
    printArray(a,n);
    return 0;
}