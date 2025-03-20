#include <iostream>
#include <conio.h>
#include <stdio.h>
#include <string>

using namespace std;

struct Datos   // creamos una nuava variable de tipo structura
{
	int codigo;
	string nombre;
	long int telefono;
};

Datos Agenda[3]; // creamos una variable de trabajo
				// con la nueva variable de estructura


int pos;

void menu(void);
void ingresar(void);
void mostrar(void);
void orden_nombre(void);
void orden_codigo(void); 
void orden_telefono(void); 
void orden_telefono_menor(void); 
void orden_codigo_menor(void); 

void menu(void)
{
	int y, opc;
	opc = 99;
	int resultado;
	pos = 0;
	/*
	cout <<" numero y : "<<y<<endl;
	cout <<" numero opc : "<<opc<<endl;
	cout <<" numero resultado : "<<resultado<<endl;
	
	getch();
	*/
	while ( opc != 0)
	{
		system("cls");
		cout<<"\n 1 Ingresar Datos";
		cout<<"\n 4 Mostrar Sin Parametros";
		cout<<"\n 5 Ordenar por nombre(orden alfabetico)";
		cout<<"\n 6 Ordenar por codigo(mayor a menor)";
		cout<<"\n 7 Ordenar por codigo(menor a mayor)";
		cout<<"\n 8 Ordenar por telefono(mayor a menor)";
		cout<<"\n 9 Ordenar por telefono(menor a mayor)";
		cout<<"\n 0 Terminar";
		cout<<"\n Ingrese Opcion: ";
		
		cin>>opc;
		fflush(stdin);  // liberar espacio
		
		switch(opc)
		{
			case 1:
				ingresar();
				break;
			case 4:
				mostrar();
				break;	
			case 5:
				orden_nombre();
				break;
			case 6: 
				orden_codigo(); 
				break; 
			case 7: 
				orden_codigo_menor(); 
				break; 
			case 8:
				orden_telefono(); 
				break; 
			case 9: 
				orden_telefono_menor(); 
				break; 
			case 0:
				exit;
			default:
				cout <<"\n Opcion no Valida !! ";
				break;
		}
		cout <<"\n\n Oprima una tecla para continuar";
		getch(); //presionar una tecla --- una espera
	}
}

void ingresar(void)
{
	int k;
	for (k=0; k<3; k++)
	{							
		cout <<endl<<"Digite el codigo del estudiante ["<<k<<"] :";
		cin>>Agenda[k].codigo;
		fflush(stdin);  // liberar espacio
		 
		cout <<endl<<"Digite el nombre del estudiante ["<<k<<"] :";
		getline(cin,Agenda[k].nombre);
		fflush(stdin);  // liberar espacio
		
		cout <<endl<<"Digite el Telefono del estudiante ["<<k<<"] :";
		cin>>Agenda[k].telefono;
		fflush(stdin);  // liberar espacio
	}
}


void mostrar(void)
{
	int k;
	k = 0;
	while ( k < 3)
	{
		cout <<" codigo en posicion : ["<<k<<"] "<<Agenda[k].codigo<<endl;
		cout <<" nombre en posicion : ["<<k<<"] "<<Agenda[k].nombre<<endl;
		cout <<" telefono en posicion : ["<<k<<"] "<<Agenda[k].telefono<<endl<<endl;
		k++;
	}	
	getch();
}



void orden_nombre(void)
{
	int k,j;
	Datos aux;
	
	for (k=0; k<2; k++)
	{
		for (j=k+1; j<3; j++)
		{
			if (Agenda[k].nombre > Agenda[j].nombre)
			{
				aux       = Agenda[k];
				Agenda[k] = Agenda[j];
				Agenda[j] = aux;
			}
		}
	}

	for (k=0; k<3; k++)
	{
		cout <<"Posicion : "<<k<<" Codigo : "<<Agenda[k].codigo<<endl;	
		cout <<"Posicion : "<<k<<" Nombre : "<<Agenda[k].nombre<<endl;	
		cout <<"Posicion : "<<k<<" Telenono : "<<Agenda[k].telefono<<endl;	
	}
	getch();
}


void orden_codigo(void)
{
	int k,j;
	Datos aux;
	
	for (k=0; k<2; k++)
	{
		for (j=k+1; j<3; j++)
		{
			if (Agenda[k].codigo < Agenda[j].codigo)
			{
				aux       = Agenda[k];
				Agenda[k] = Agenda[j];
				Agenda[j] = aux;
			}
		}
	}

	for (k=0; k<3; k++)
	{
		cout <<"Posicion : "<<k<<" Codigo : "<<Agenda[k].codigo<<endl;	
		cout <<"Posicion : "<<k<<" Nombre : "<<Agenda[k].nombre<<endl;	
		cout <<"Posicion : "<<k<<" Telenono : "<<Agenda[k].telefono<<endl;	
	}
	getch();
}

void orden_codigo_menor(void)
{
	int k,j;
	Datos aux;
	
	for (k=0; k<2; k++)
	{
		for (j=k+1; j<3; j++)
		{
			if (Agenda[k].codigo > Agenda[j].codigo)
			{
				aux       = Agenda[k];
				Agenda[k] = Agenda[j];
				Agenda[j] = aux;
			}
		}
	}

	for (k=0; k<3; k++)
	{
		cout <<"Posicion : "<<k<<" Codigo : "<<Agenda[k].codigo<<endl;	
		cout <<"Posicion : "<<k<<" Nombre : "<<Agenda[k].nombre<<endl;	
		cout <<"Posicion : "<<k<<" Telenono : "<<Agenda[k].telefono<<endl;	
	}
	getch();
}


void orden_telefono(void)
{
	int k,j;
	Datos aux;
	
	for (k=0; k<2; k++)
	{
		for (j=k+1; j<3; j++)
		{
			if (Agenda[k].telefono < Agenda[j].telefono)
			{
				aux       = Agenda[k];
				Agenda[k] = Agenda[j];
				Agenda[j] = aux;
			}
		}
	}

	for (k=0; k<3; k++)
	{
		cout <<"Posicion : "<<k<<" Codigo : "<<Agenda[k].codigo<<endl;	
		cout <<"Posicion : "<<k<<" Nombre : "<<Agenda[k].nombre<<endl;	
		cout <<"Posicion : "<<k<<" Telenono : "<<Agenda[k].telefono<<endl;	
	}
	getch();
}

void orden_telefono_menor(void)
{
	int k,j;
	Datos aux;
	
	for (k=0; k<2; k++)
	{
		for (j=k+1; j<3; j++)
		{
			if (Agenda[k].telefono > Agenda[j].telefono)
			{
				aux       = Agenda[k];
				Agenda[k] = Agenda[j];
				Agenda[j] = aux;
			}
		}
	}

	for (k=0; k<3; k++)
	{
		cout <<"Posicion : "<<k<<" Codigo : "<<Agenda[k].codigo<<endl;	
		cout <<"Posicion : "<<k<<" Nombre : "<<Agenda[k].nombre<<endl;	
		cout <<"Posicion : "<<k<<" Telenono : "<<Agenda[k].telefono<<endl;	
	}
	getch();
}

main()
{
	menu();
}
