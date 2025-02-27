#include <iostream>
#include <conio.h>
#include <stdio.h>
#include <string>

using namespace std;

//** variable globales
int codigo[10]; 	// arreglo de 10 celdas de numeros 
int conta;      	// variable que controla la posicion de captura en el arreglo
//** Fin variables globales

//* se declaran las funciones o procedimientos a utilizar --- 'propias'
void menu(void);
void captura(void);
void mostrar(void);
void borrar(void);
void modifica(void);
void ordenar(void);
//* Fin declarar funciones


main()  // funcion principal 
{
	menu();		
}

void menu(void)
{
	int opc;
	opc = 99;
	conta = 0;
	while (opc != 0)
	{
		system("cls");
		cout<<"\n 1. Ingresar Codigos";
		cout<<"\n 2. Mostrar  Codigos";
		cout<<"\n 3. Borrar  Codigos";
		cout<<"\n 4. Modifica  Codigos";
		cout<<"\n 5. Ordenar  Codigos";
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
			case 3:
				borrar();
				break;
			case 4:
				modifica();
				break;
			case 5:
				ordenar();
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


//*** inicio de Capturar
void captura(void)
{
	int k;
	k = 0;       // variable utilizada para recorrer el arreglo y buscar el numero digitado  
	int existe;   
	existe = 0;  // variable de control '0' el numero digitado no existe en el arreglo 
	             // otro numero en 'existe' quiere decir que se encuentra el numeo repetido
	             
	
	if (conta < 10) // se valida que no se capture mas de 10 numeros
	{
	    cout <<"\n digite un numero en la posicion ["<<conta<<"] :  ";
		cin >> codigo[conta];   // capturamos un numero en la posición 'conta'	
		
		// verificamos que el numero digitado no exista en el arreglo
		k = 0;
		while ( k < conta && existe == 0 ) // la busqueda se cancela cuando una de las dos condiciones no se cumple
		{
		    if ( codigo[k] == codigo[conta] )
			{
			   cout<<"\n Existe el numero digitado en la posicion   ["<<k<<"] \n";
			   existe = 1; // alteramos el control del ciclo while ya se encontro el numero
			}
			k++;	
		}
		
		if ( existe == 0 ) //  se valida si la variable trae el valor inicial ... [0]
		                   //  quiere decir que no se encontro el número en la busqueda
		{
			conta++; // realizamos la variacion en 'conta'  para capturar en la proxima posicion
		}	
	}
	else
	{
	   cout <<"\n El arreglo 'numeros' se encuentra lleno";	
	}
}
//*** Fin de Capturar

//* Inicio de Borrar
void borrar(void)
{
	int codigo_borrar;
	int k;
	
	int existe; // variable bandera utilizada en la busqueda del codigo a borrar
	int z, x;  // variable utilizadas en el corrimiento de los datos
	
	system("cls");
	cout <<"\n Procedimiento Borrar \n";
	
	if (conta == 0)  //si conta tiene el valor de 0 'cero' ... no hay datos en el arreglo 
	{
		cout <<"\n\n el Arreglo esta vacio \n";	
	}
	else
	{
		cout <<"\n\n Digite un Codigo a Borrar : ";
		cin>>codigo_borrar;
		existe = 0; // activamos la variable existe para verificar la busqueda del codigo digitado
		k = 0;  // variable para recorrer el arreglo en la busqueda
		
		// buscamos el codigo ultimo digitado ...  si existe en el arreglo
		while ( existe == 0 && k < conta ) 
		{
			if (codigo[k] == codigo_borrar ) // si esta condicion es cierta encontramos el codigo a borrar
			{
				existe = 1; // activamos el existe ... se encontro el numero
				
			   // como se encontro ajustamos los datos del arreglo 
			   // corriendolos hacia la izquierda
			   conta--;     // el control de 'conta' se reduce en 1 .... este es el maximo de datos capturados
			   for (z=k; z<conta; z++ ) // realizamos el corrimiento desde la posicion 'encontrada' = k 
			   {
				  x = z + 1; // 'x' es la posicion siguiente
			   	  codigo[z] = codigo[x];
			   }
			}
			k++; // incrementamos la variable para la busqueda dentro del arreglo
		}
		if ( existe == 0 ) // validamos si 'existe' se modifico ... si contiene '0' el codigo no se encontro
		{
			cout<<"\n\n El Codigo Buscado no existe en el arreglo \n";
		}
		else
		{
			cout<<"\n\n El Codigo Buscado se Borro del arreglo \n";
		}
	}
}

//* Fin de Borrar


//* Inicio de Mostrar
void mostrar(void)
{
	int j;
	for (j=0; j<conta; j++ ) // se muestra desde la posicion [0] hasta la posicion [conta]
	{
		cout<<"\n Codigo posicion ["<<j<<"] : "<<codigo[j];	
	}
}	
//* Fin de Mostrar


//* Inicio de Modifica
void modifica(void)
{
	int pos;
	int numero; //Variable para guardar el nuemro ingresado 
	cout <<"Digite la Posicion del numero a modificar ";
	cin >>pos;
	if ( pos >= 0 && pos <conta )
	{
		cout <<"\n digite un numero en la posicion ["<<pos<<"] :  ";
		cin >> numero;

		// Validar que el numero modificado no exista en el arreglo 
		int x; 
		x = 0; // Variable que recorre el arreglo
		int exist; 
		exist = 0; // Variable que al cambiar de valor inidca que el numero ya existe 

		while ( x < conta && exist == 0 ) // Condiciones para finalizar la busqueda 
		{
		    if ( codigo[x] == numero )
			{
			   cout<<"\n Existe el numero digitado en la posicion   ["<< x <<"] \n"; 
			   exist = 1; // Cambia el valor de la variable indicando que ya existe el numero  
			}
			x++; // Si no se encuentra el numero, se incrementa el valor de "x" para continuar recorriendo el arreglo 	
		}

		if(exist == 0)
		{
			codigo[pos] = numero; 
			cout<<"\n Numero modificado exitosamente"; 

		}
		
	}
	else
	{
		cout <<"\n Error en la posicion digitada :  "<<pos;	
	}
		
}	
//* Fin de Modifica

//* Inicio de Ordenar
void ordenar(void)
{	int j,k,t,aux;
	t = conta - 1;
	for (j=0; j<t; j++ ) 
	{   
		for (k=j+1; k<conta; k++ )
		{
			if (codigo[j] < codigo[k] )
			{
				aux = codigo[k];
				codigo[k] = codigo[j];
				codigo[j] = aux;
			}	
		}	
	}		
}	
//* Fin decin >>pos;
