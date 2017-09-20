#include<stdio.h>
void fun2(int s1,int s2)
{
    int a,b;
   do
    {
        a=0;
        while(s1>0)
        {
            a+=s1%10;
            s1=s1/10;
        }
        s1=a;
    }while(a>9);
    do
    {
        b=0;
        while(s2>0)
        {
            b+=s2%10;
            s2=s2/10;
        }
        s2=b;
    }while(b>9);
    if(a<b)
        printf("%d",a*a);
    else
        printf("%d",b*b);
}
void fun1(int op[],int s)
{
    int i,sm=op[0],l=op[0],sum1=0,sum2=1;
    for(i=0;i<s;i++)
    {
        if(sm>op[i])
            sm=op[i];
        if(l<op[i])
            l=op[i];
    }
    for(i=0;i<s;i++)
    {
        sum1+=(l*op[i]);
        sum2*=(sm+op[i]);
    }
    fun2(sum1,sum2);
}
int main()
{
	char g[20];
	int i,x=0,re[20];
	gets(g);
	for(i=0;i<strlen(g);i++)
    {
        if(g[i]>47&&g[i]<58)
        {
            re[x]=(g[i]-'0');
            x++;
        }
    }
    fun1(re,x);
    return 0;
}
