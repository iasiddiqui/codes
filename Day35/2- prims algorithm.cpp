//Find Minimum Cost Spanning Tree of a given undirected graph using Prim’s algorithm.

#include<iostream>
using namespace std;
int c[10][10],n;
void prims()
{
    int visited[10],i,j,u,v,min,count=1,sum=0;
    for(i=1;i<=n;i++)
        visited[i]=0;
    visited[1]=1;
    while(count!=n)
    {
        min=9999;
        for(i=1;i<=n;i++)
            for(j=1;j<=n;j++)
            if(visited[i]==1)
                if(c[i][j]<min)
                {
                    min=c[i][j];
                    u=i;
                    v=j;
                }
            if(visited[v]!=1)
            {
                cout<<"\nEdge ("<<u<<","<<v<<") : "<<min;
                visited[v]=1;
                count++;
                sum=sum+min;
            }
            c[u][v]=c[v][u]=9999;
    }
    cout<<"\nWeight of minimum spanning tree = "<<sum<<endl;
}
int main()
{
    int i,j;
    cout<<"Enter number of vertices : ";
    cin>>n;
    cout<<"Enter cost matrix : \n";
    for(i=1;i<=n;i++)
        for(j=1;j<=n;j++)
            cin>>c[i][j];
    prims();
}
