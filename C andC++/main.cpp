#include <iostream>
#include <conio.h>
#include <stdio.h>
#include <string>

using namespace std;

int codigo[10];   // variable global

//fuciones del programa
void menu(void);
void captura(void);
void mostrar(void);

//int calculo(int,int);

main()  // funcion principal 
{
	menu();		
}

void menu(void)
{
	int opc;   // variable local
	
	opc = 99;
	while (opc != 0)
	{
		system("cls");
		cout<<"\n 1. Ingresar Codigos";
		cout<<"\n 2. Mostrar  Codigos";
		cout<<"\n 0. Terminar ";
		cout<<"\n Ingresar Opcion : ";
		cin>>opc;
		
		switch(opc)
		{
			case 1:
				captura();
				break;
			case 2:
				mostrar();
				break;
			case 0:
				exit;
				break;
			default:
				cout<<"Opcion no valida";
				break;
		}
		cout<<"\n\n Oprima una tecla para continuar";
		getch();		
	}
}

void captura(void)
{
	int conta;
	for (conta=0; conta<10; conta++ )
	{
		cout<<"\n Digite un Codigo : ";
		cin>>codigo[conta];	
	}
}

void mostrar(void)
{
	int conta;
	for (conta=0; conta<10; conta++ )
	{
		cout<<"\n Codigo : "<<codigo[conta];	
	}
}	
