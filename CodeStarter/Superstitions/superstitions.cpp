#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin>>n;
    int x;
    cin>>x;
    
   vector<int>arr(n);
   for(int i=0;i<n;i++)
   {
       cin>>arr[i];
   }
   
   set<int>m;
   int res=0;
   for(int i=0;i<n;i++)
   {
       if(m.find(x-arr[i])!=m.end())
       {
           res++;
       }
       else
       {
           m.insert(arr[i]);
       }
   }
   cout<<res<<endl;
   
	return 0;
	
}
