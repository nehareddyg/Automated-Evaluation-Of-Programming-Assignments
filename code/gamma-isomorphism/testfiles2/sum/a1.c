#include<stdio.h>

int sum(int arr[], int n)
{
    int sum = 0; 
    int i;
 
    
    for (i = 0; i < n; i++)
       sum +=  arr[i];
 
    return sum;
}

