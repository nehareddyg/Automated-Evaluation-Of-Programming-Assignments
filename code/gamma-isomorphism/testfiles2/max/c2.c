#include <stdio.h>
int max(int n1,int n2,int n3){
	if( n1>=n2 && n1>=n3 )
       return n1;

    if( n2>=n1 && n2>=n3 )
       return n1;

    if( n3>=n1 && n3>=n2 )
       return n3;
}