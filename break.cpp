#include<iostream>
#include<windows.h>
using namespace std;
int main()
{
	int a;
	system("Color 0C");
	cout<<"\nEnter the no of day\n";
	cin>>a;
	
	switch (a)
	{
	case 1:
			cout<<"\nI'm on leave";
			break;
			
	case 2:
			cout<<"\nI'm on work";
			break;
			
	case 3:
			cout<<"\nI'm at park";
			break;
			
	case 4:
			cout<<"\nI'm at shopping mall";
			break;
			
	case 5:
			cout<<"\nI'm at cafe";
			break;
			
	case 6:
			cout<<"\nI'm in theatre";
			break;
			
	case 7:
			cout<<"\nI'm done all weekly tasks";
			break;
					
	}
	return 0;
}
