package SortingAlgorithm;

public class SelectionSort {
  
    public static void selectionSort(int arr[]){


        int n=arr.length;

        for(int i=0;i<n;i++){
         
            int minIndex=i;
            for(int j=i+1;j<n;j++)
            {
            
            if(arr[j]<arr[minIndex])
            {
                minIndex=j;
            }
           
            }
    
            swap(arr,minIndex,i);
            //or this
         /*  int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        */
    }

    }

public static void swap(int [] arr ,int i,int j)
{
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}

    public static void main(String[] args) {

        
int arr[]={12,13,34,10,5};

selectionSort(arr);

for(int i=0;i<arr.length;i++)
{
    System.out.println(arr[i]);
}

    }
}
