//Find Minimum Cost Spanning Tree of a given undirected graph using Kruskal’s algorithm.

#include<iostream>
using namespace std;
void kruskal(int cost[10][10], int n)
{
    int parent[10],i,j,a,b,u,v,min,count=1,sum=0;
    for(i=1;i<=n;i++)
        parent[i]=0;
    while(count!=n)
    {
        min=9999;
        for(i=1;i<=n;i++)
            for(j=1;j<=n;j++)
                if(cost[i][j]<min)
                {
                    min=cost[i][j];
                    u=a=i;
                    v=b=j;
                }
        while(parent[u]!=0)
            u=parent[u];
        while(parent[v]!=0)
            v=parent[v];
        if(u!=v)
        {
            count++;
            sum=sum+cost[a][b];
            cout<<"\nEdge ("<<a<<","<<b<<") : "<<cost[a][b];
            parent[v]=u;
        }
        cost[a][b]=cost[b][a]=9999;
    }
    cout<<"\nWeight of minimum spanning tree = "<<sum<<endl;
}
int main()
{
    int cost[10][10],i,j,n;
    cout<<"\nEnter the number of vertices : ";
    cin>>n;
    cout<<"\nEnter the cost matrix : \n";
    for(i=1;i<=n;i++)
        for(j=1;j<=n;j++)
            cin>>cost[i][j];
    kruskal(cost,n);
    return 0;
}
