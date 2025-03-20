#include <iostream>
#include <conio.h>
#include <stdio.h>
#include <string>

using namespace std;

struct Datos   // creamos una nuava variable de tipo structura
{
	int codigo;
	string nombre;
	string ciudad;
	string direccion;
	long int telefono;
	string correo;
	long int docIdentidad;
};

Datos Agenda[30]; // creamos una variable de trabajo
				// con la nueva variable de estructura


int pos;

void menu(void);
void ingresar(void);
void modificar(void);
void mostrar(void);
void orden_codigo(void);
void orden_telefono(void);
void orden_nombre(void);
void borrar(void);
void ordenar_por_ciudad(void);
void menu(void) 
{
	int opc;
	opc = 99;

	pos = 0;
	
	while ( opc != 0)
	{
		system("cls");
		cout<<"\n 1 Ingresar Datos";
		cout<<"\n 2 Modificar";
		cout<<"\n 3 Borrar";
		cout<<"\n 4 Mostrar Sin Parametros";
		cout<<"\n 5 Ordenar con la variable CODIGO";
		cout<<"\n 6 Ordenar con la variable TELEFONO";
		cout<<"\n 7 Ordenar con la variable NOMBRE";
        cout<<"\n 8 Ordenar por ciudad y nombre"; 
		cout<<"\n 0 Terminar";
		cout<<"\n Ingrese una Opcion: ";
		
		cin>>opc;
		fflush(stdin);  // liberar espacio
		
		switch(opc)
		{
			case 1:
				ingresar();
				break;
			case 2:
				modificar();
				break;
			case 3:
				borrar(); 
				break; 
			case 4:
				mostrar();
				break;	
			case 5:
				orden_codigo();
				break;
			case 6:
				orden_telefono();
				break;
			case 7:
				orden_nombre();
				break;
            case 8: 
                ordenar_por_ciudad(); 
                break; 
			case 0:
				exit; 
				break;
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
	for (k=0; k< 30; k++)
	{							
		cout <<endl<<"Digite el codigo ["<<k<<"] :";
		cin>>Agenda[k].codigo;
		fflush(stdin);  // liberar espacio
		 
		cout <<endl<<"Digite el nombre ["<<k<<"] :";
		getline(cin,Agenda[k].nombre);
		fflush(stdin);  // liberar espacio
		
		cout <<endl<<"Digite la ciudad ["<<k<<"] :";
		getline(cin,Agenda[k].ciudad);
		fflush(stdin);  // liberar espacio
		
		cout <<endl<<"Digite la direccion ["<<k<<"] :";
		getline(cin,Agenda[k].direccion);
		fflush(stdin);  // liberar espacio
		
		cout <<endl<<"Digite el Telefono del estudiante ["<<k<<"] :";
		cin>>Agenda[k].telefono;
		fflush(stdin);  // liberar espacio
		
		cout <<endl<<"Digite el correo ["<<k<<"] :";
		getline(cin,Agenda[k].correo);
		fflush(stdin);  // liberar espacio
		
		cout <<endl<<"Digite el documento de identidad ["<<k<<"] :";
		cin>>Agenda[k].docIdentidad;
		fflush(stdin);  // liberar espacio
		pos ++; 
	}
}

void modificar(void)
{
    int opcion;  
	int pos2;
	cout << "\n========= METODO MODIFICAR ============\n";
	cout <<"Digite la Posicion de los datos que quiere modificar ";
	cin >>pos2;
	if ( pos2 >= 0 )
	{
        system("cls");
		
		
        cout <<"Que desea modificar: ";
        cout <<"\n 1. Modificar codigo ";
		cout <<"\n  2. Modifacar nombre ";
		cout <<"\n  3. Modificar telefono ";
		cout <<"\n  4. Modificar ciudad ";
		cout <<"\n  5. Modificar direccion ";
		cout <<"\n  6. Modificar correo ";
		cout <<"\n  7. Modificar Doc.Identidad ";
        cout <<"\n     Ingrese una opcion: "; 
		cin >>opcion; 
        fflush(stdin); 

        switch (opcion)
        {
        case 1:
		    cout <<endl<<"Digite el codigo en ["<<pos2<<"] :";
		    cin>>Agenda[pos2].codigo;
		    fflush(stdin);  // liberar espacio
            break;
        case 2: 
            cout <<endl<<"Digite el nombre en ["<<pos2<<"] :";
		    getline(cin,Agenda[pos2].nombre);
		    fflush(stdin);  // liberar espacio
            break; 
        case 3: 
            cout <<endl<<"Digite el Telefono en ["<<pos2<<"] :";
		    cin>>Agenda[pos2].telefono;
		    fflush(stdin);  // liberar espacio
            break; 
        case 4: 
            cout <<endl<<"Digite la ciudad en ["<<pos2<<"] :";
		    getline(cin,Agenda[pos2].ciudad);
		    fflush(stdin);  // liberar espacio
		
            break; 
        case 5: 
            cout <<endl<<"Digite la direccion en ["<<pos2<<"] :";
		    getline(cin,Agenda[pos2].direccion);
		    fflush(stdin);  // liberar espacio
            break; 
        case 6: 
            cout <<endl<<"Digite el correo en ["<<pos2<<"] :";
		    getline(cin,Agenda[pos2].correo);
		    fflush(stdin);  // liberar espacio
            break; 
        case 7: 
            cout <<endl<<"Digite el documento de identidad ["<<pos2<<"] :";
		    cin>>Agenda[pos2].docIdentidad;
		    fflush(stdin);  // liberar espacio
	
            break; 

        default:
        cout<<"\n opcion no valida"; 
            break;
        }
		
		cout <<"\n\n Oprima una tecla para continuar";
		getch(); //presionar una tecla --- una espera
	}
		
	else
	{
		cout <<"\n Error en la posicion digitada :  "<<pos2;	
	}
		
	
}


void borrar(void)
{
    int pos_borrar, opcion_borrar;

    if (pos == 0) {
        cout << "\nAgenda vacia";
        cout << "\n\n Oprima una tecla para continuar";
        getch(); 
        return;
    }

    cout << "\n========= METODO BORRAR ============\n";
    cout << "\nDigite una posicion a borrar (0 a " << pos - 1 << "): ";
    cin >> pos_borrar;

    // Verificamos que la posición esté en el rango válido
    if (pos_borrar < 0 || pos_borrar >= pos) {
        cout << "\nPosicion no valida";
        cout << "\n\n Oprima una tecla para continuar";
        getch(); 
        return;
    }

    cout << "\n Que atributo desea borrar?\n";
    cout << "\n1. Borrar codigo";
    cout << "\n2. Borrar nombre";
    cout << "\n3. Borrar telefono";
    cout << "\n4. Borrar ciudad";
    cout << "\n5. Borrar direccion";
    cout << "\n6. Borrar correo";
    cout << "\n7. Borrar documento de identidad";
    cout << "\nIngrese una opcion (1-7): ";
    cin >> opcion_borrar;

    // Limpiar el buffer de entrada
    fflush(stdin);

    // Borrar el atributo seleccionado
    switch (opcion_borrar) {
        case 1:
            Agenda[pos_borrar].codigo = 0; // Se borra el código (valor predeterminado 0)
            cout << "Código borrado." << endl;
            break;
        case 2:
            Agenda[pos_borrar].nombre = ""; 
            cout << "Nombre borrado." << endl;
            break;
        case 3:
            Agenda[pos_borrar].telefono = 0; 
            cout << "Teléfono borrado." << endl;
            break;
        case 4:
            Agenda[pos_borrar].ciudad = ""; 
            cout << "Ciudad borrada." << endl;
            break;
        case 5:
            Agenda[pos_borrar].direccion = ""; 
            cout << "Dirección borrada." << endl;
            break;
        case 6:
            Agenda[pos_borrar].correo = ""; 
            cout << "Correo borrado." << endl;
            break;
        case 7:
            Agenda[pos_borrar].docIdentidad = 0; 
            cout << "Documento de identidad borrado." << endl;
            break;
        default:
            cout << "Opción no válida." << endl;
            break;
    }

    cout << "\n\n Oprima una tecla para continuar";
    getch();
}




void mostrar(void)
{
	int k;
	k = 0;
	while ( k < pos)
	{
		cout <<" codigo en posicion : ["<<k<<"] "<<Agenda[k].codigo<<endl;
		cout <<" nombre en posicion : ["<<k<<"] "<<Agenda[k].nombre<<endl;
		cout <<" telefono en posicion : ["<<k<<"] "<<Agenda[k].telefono<<endl;
		cout <<" ciudad en posicion : ["<<k<<"] "<<Agenda[k].ciudad<<endl;
		cout <<" direccion en posicion : ["<<k<<"] "<<Agenda[k].direccion<<endl;
		cout <<" correo en posicion : ["<<k<<"] "<<Agenda[k].correo<<endl;
		cout <<" Doc.Identidad en posicion : ["<<k<<"] "<<Agenda[k].docIdentidad<<endl<<endl;
		k++;
	}	
	getch();
}



void orden_codigo(void)
{
	int k,j;
	Datos aux;
	
	for (k=0; k<pos - 1; k++)
	{
		for (j=k+1; j< pos; j++)
		{
			if (Agenda[k].codigo> Agenda[j].codigo)
			{
				aux       = Agenda[k];
				Agenda[k] = Agenda[j];
				Agenda[j] = aux;
			}
		}
	}

	for (k=0; k<pos; k++)
	{
		cout <<" codigo en posicion : ["<<k<<"] "<<Agenda[k].codigo<<endl;
		cout <<" nombre en posicion : ["<<k<<"] "<<Agenda[k].nombre<<endl;
		cout <<" telefono en posicion : ["<<k<<"] "<<Agenda[k].telefono<<endl;
		cout <<" ciudad en posicion : ["<<k<<"] "<<Agenda[k].ciudad<<endl;
		cout <<" direccion en posicion : ["<<k<<"] "<<Agenda[k].direccion<<endl;
		cout <<" correo en posicion : ["<<k<<"] "<<Agenda[k].correo<<endl;
		cout <<" Doc.Identidad en posicion : ["<<k<<"] "<<Agenda[k].docIdentidad<<endl<<endl;
	}
	getch();
}
void orden_telefono(void)
{
	int k,j;
	Datos aux;
	
	for (k=0; k<pos - 1; k++)
	{
		for (j=k+1; j<pos; j++)
		{
			if (Agenda[k].telefono> Agenda[j].telefono)
			{
				aux       = Agenda[k];
				Agenda[k] = Agenda[j];
				Agenda[j] = aux;
			}
		}
	}

	for (k=0; k<3; k++)
	{	
		
		cout <<" codigo en posicion : ["<<k<<"] "<<Agenda[k].codigo<<endl;
		cout <<" nombre en posicion : ["<<k<<"] "<<Agenda[k].nombre<<endl;
		cout <<" telefono en posicion : ["<<k<<"] "<<Agenda[k].telefono<<endl;
		cout <<" ciudad en posicion : ["<<k<<"] "<<Agenda[k].ciudad<<endl;
		cout <<" direccion en posicion : ["<<k<<"] "<<Agenda[k].direccion<<endl;
		cout <<" correo en posicion : ["<<k<<"] "<<Agenda[k].correo<<endl;
		cout <<" Doc.Identidad en posicion : ["<<k<<"] "<<Agenda[k].docIdentidad<<endl<<endl;
	}
	getch();
}

void orden_nombre(void)
{
	int k,j;
	Datos aux;
	
	for (k=0; k<pos - 1; k++)
	{
		for (j=k+1; j<pos; j++)
		{
			if (Agenda[k].nombre> Agenda[j].nombre)
			{
				aux       = Agenda[k];
				Agenda[k] = Agenda[j];
				Agenda[j] = aux;
			}
		}
	}

	for (k=0; k<3; k++)
	{
		cout <<" codigo en posicion : ["<<k<<"] "<<Agenda[k].codigo<<endl;
		cout <<" nombre en posicion : ["<<k<<"] "<<Agenda[k].nombre<<endl;
		cout <<" telefono en posicion : ["<<k<<"] "<<Agenda[k].telefono<<endl;
		cout <<" ciudad en posicion : ["<<k<<"] "<<Agenda[k].ciudad<<endl;
		cout <<" direccion en posicion : ["<<k<<"] "<<Agenda[k].direccion<<endl;
		cout <<" correo en posicion : ["<<k<<"] "<<Agenda[k].correo<<endl;
		cout <<" Doc.Identidad en posicion : ["<<k<<"] "<<Agenda[k].docIdentidad<<endl<<endl;
	}
	getch();
}

void ordenar_por_ciudad(void) 
{
    Datos aux; // Variable auxiliar para intercambio

    for (int i = 0; i < pos - 1; i++) {
        for (int j = i + 1; j < pos; j++) {
            // Ordenar por ciudad, y si son iguales, ordenar por nombre
            if (Agenda[i].ciudad > Agenda[j].ciudad || 
                (Agenda[i].ciudad == Agenda[j].ciudad && Agenda[i].nombre > Agenda[j].nombre)) {
                // Intercambiar si se cumple alguna condición
                aux = Agenda[i];
                Agenda[i] = Agenda[j];
                Agenda[j] = aux;
            }
        }
    }
    // Mostramos todos los datos ordenados 
    for (int k = 0; k < pos; k++) {
		cout <<" codigo en posicion : ["<<k<<"] "<<Agenda[k].codigo<<endl;
		cout <<" nombre en posicion : ["<<k<<"] "<<Agenda[k].nombre<<endl;
		cout <<" telefono en posicion : ["<<k<<"] "<<Agenda[k].telefono<<endl;
		cout <<" ciudad en posicion : ["<<k<<"] "<<Agenda[k].ciudad<<endl;
		cout <<" direccion en posicion : ["<<k<<"] "<<Agenda[k].direccion<<endl;
		cout <<" correo en posicion : ["<<k<<"] "<<Agenda[k].correo<<endl;
		cout <<" Doc.Identidad en posicion : ["<<k<<"] "<<Agenda[k].docIdentidad<<endl<<endl;
    }
    getch(); // Esperar una tecla antes de continuar
}


main()
{
	menu();
}