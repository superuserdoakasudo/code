    #include<stdio.h>  
    int main(){    
    int n,i,m=0,flag=0;    
    printf("Enter the number to check prime: \n");    
    scanf("%d",&n);    
    m=n/2;    
    for(i=2;i<=m;i++)    
    {    
    if(n%i==0)    
    {    
    printf("Number is not a prime \n");    
    flag=1;    
    break;    
    }    
    }    
    if(flag==0)    
    printf("Number is prime \n");     
    return 0;  
     }    