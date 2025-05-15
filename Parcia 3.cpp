#include <iostream>
#include <conio.h>
#include<stdio.h>
#include<stdlib.h>
#include<string.h>

using namespace::std;


struct Empleado
{
	int codigo;
	string nombre;
	int sueldo;
	
	Empleado *empleado;
};


struct Oficina
{
	int codigo;
	string nombre;
	
	Oficina *izq;
	Oficina *der;
	Empleado *abajo; 
	
}*cab, *cola, *nuevo, *bus1, *bus2;


void menu(void);
void menuDependencias(void);
void menuEmpleados(void);
void menuEspecial(void);

void crearDependencia(void);
void modificarDependencia(void);
void borrarDependencia(void);
void listarCola(void);
void listarPila(void);

void crearEmpleado(void);
void modificarEmpleado(void);
void borrarEmpleado(void);
void listar(void);



/*  ------------------------------------------  CODIGO DE LOS MENUS  ---------------------------------------------*/

main()
{
	menu();
}


void menu(void){
	
	int opc;
	opc = 2;
	
	while(opc!=0)
	{
		
		system("cls");
		
		cout<< "MENU GENERAL" << endl;
		cout<< " 1. Dependencias" << endl;
		cout<< " 2. Empleados"<< endl;
		cout<< " 3. Menu especial" << endl;
		cin>>opc;
		
		
     switch(opc)
     {
       case 1: 
	   	menuDependencias();
     	break;
       case 2:
       	menuEmpleados();
       	break;
       case 3: 
        menuEspecial();
        break;
        
        default:
        cout<< endl << "Opcion no valida" << endl;
        break;
     	
     	
     	
	 }
		
		cout << endl << "Oprima una tecla para continuar." << endl;
		getch();
			
	}
	
}


void menuDependencias(void)
{
	int opc;
	opc = 2;
	
	while(opc!=0)
	{
		
		system("cls");
		
		cout<< "    MENU DEPENDENCIAS   " << endl;
		cout<< " 1. Crear Dependencia" << endl;
		cout<< " 2. Modificar Dependencia"<< endl;
		cout<< " 3. Borrar Dependencia" << endl;
		cout<< " 4. Listar por Cola" << endl;
		cout<< " 5. Listar por Pila" << endl;
		cout<< " 6. Regresar" << endl;
		cin>>opc;
		
		 switch(opc)
       {
        	case 1: 
	   		crearDependencia();
     		break;
       		case 2:
       		modificarDependencia();
       		break;
       		case 3: 
       		borrarDependencia();
        	break;
        	case 4: 
       		listarCola();
        	break;
        	case 5: 
       		 listarPila();
        	break;
        	case 6:
        	menu();
        	break;
        	default:
        	cout<< endl << "Opcion no valida" << endl;
       		 break;
     	
     	}
		
		cout << endl << "Oprima una tecla para continuar." << endl;
		getch();
		
     }
	
	

}


void menuEmpleados(void)
{
	int opc;
	opc = 2;
	
	while(opc!=0)
	{
		
		system("cls");
		
		cout<< "    MENU EMPLEADOS   " << endl;
		cout<< " 1. Crear Empleado" << endl;
		cout<< " 2. Modificar Empleado"<< endl;
		cout<< " 3. Borrar Empleado" << endl;
		cout<< " 4. Listar" << endl;
		cout<< " 5. Regresar" << endl;
		cin>>opc;
		
		
		 switch(opc)
       {
        	case 1: 
	   		crearEmpleado();
     		break;
       		case 2:
       		modificarEmpleado();
       		break;
       		case 3: 
       		 borrarEmpleado();
        	break;
        	case 4: 
       		 listar();
        	break;
        	case 5:
        	menu();
        	break;
        	default:
        	cout<< endl << "Opcion no valida" << endl;
       		 break;
     	
     	}
		
		cout << endl << "Oprima una tecla para continuar." << endl;
		getch();
		
     }
	
	

}

void menuEspecial(void){
}





/*  ------------------------------------------  CODIGO DE LAS DEPENDENCIAS  ---------------------------------------------*/

void crearDependencia(void){
    int existe;
	nuevo = new(Oficina);


	cout <<"\n Ingrese el Codigo de la dependencia: ";
	cin >>nuevo->codigo;
	fflush(stdin);
	
    cout<<"Ingrese el nombre : ";
    getline(cin,nuevo->nombre);
    cout<<"\n\n";
    fflush(stdin);
	
	nuevo->der = NULL;
	nuevo->izq = NULL;
		
	if ( !cab )	
	{
		cab = new(Oficina);
		cola = new(Oficina);
		cab = nuevo;
		cola = nuevo;
		
	}
	else
	{
		if ( nuevo->codigo >= cola->codigo )
		{
			if(nuevo->codigo > cola->codigo){
			nuevo->izq = cola;
			cola->der  = nuevo;
			cola       = nuevo;
			cola->der = cab; 
			cab->izq = cola; 
			}else{	
			cout<<"\n\n Codigo ya existe\n\n";
			} 
		}
		else
		{
			if ( nuevo->codigo <= cab->codigo )
			{
				if(nuevo->codigo < cab->codigo){
				nuevo->der = cab;
				cab->izq   = nuevo;
				cab        = nuevo;
				cab->izq = cola; 
				cola->der = cab;
				}else{	
				
				cout<<"\n\n Codigo ya existe\n\n";
				} 
			}
			else
			{
				bus1 = new(Oficina);
				bus2 = new(Oficina);
				bus1 = cab;
			 	bus2 = bus1->der;
			 	existe = 0;
			 	while ( existe == 0 )
			 	{
			 		if ( nuevo->codigo < bus2->codigo )
					{
					    nuevo->izq = bus1;
					    nuevo->der = bus2;
					    bus1->der  = nuevo;
					    bus2->izq  = nuevo;
					    existe = 8;
					} 
					else
					{
						bus1  = bus1->der;
						bus2  = bus2->der;	
					}
				}
				if( nuevo->codigo = bus2->codigo){

						cout<<"\n\n Codigo ya existe\n\n"; 
					}	
			}			
		}		
	}
}


void modificarDependencia(void){
}


void borrarDependencia(void){
	int existe; 
	int codigo_borrar; 
	cout<<"Ingrese el codigo que desea eliminar: "; 
	cin>> codigo_borrar; 
	if(codigo_borrar <= cab->codigo)
	{
		if(codigo_borrar == cab->codigo)
		{
		nuevo = new(Oficina); 
		nuevo = cab; 
		cab = cab->der; 
		cab->izq = cola; 
		delete(nuevo); 
		cout<<"Elemento eliminado"; 
		}
		else
		{
			cout<<"Codigo no encontrado"; 
		}

	}
	else
	{
		if(codigo_borrar >= cola->codigo)
		{
			if(codigo_borrar == cola->codigo)
			{
				nuevo = new(Oficina); 
				nuevo = cola; 
				cola = cola->izq; 
				cola->der = cab; 
				delete(nuevo);
				cout<<"Elemento eliminado";  
			}
			else
			{
				cout<<"Codiogo no encontrado"; 
			}
		}
		else
		{
			bus1 = new(Oficina); 
			bus2 = new(Oficina); 
			bus1 = cab; 
			bus2 = cab->der; 
			existe = 0; 
			while(existe == 0)
			{
				if(codigo_borrar <= bus2->codigo)
				{
					if(codigo_borrar == bus2->codigo)
					{
					nuevo = new(Oficina); 
					nuevo = bus2; 
					bus1->der = bus2->der; 
					bus2->der->izq = bus1; 
					delete(nuevo); 
					existe = 1; 
					cout<<"Elemento eliminado"; 
					}
					else
					{
						cout<<"Codigo no encontrado"; 
					}
				}
				else
				{
					bus1 = bus2; 
					bus2 = bus2->der; 
				}
			}
		}
	}
}


void listarCola(void){
	if(cab != NULL){
		nuevo = new(Oficina); 	
		nuevo = cab; 
		do{
			cout<<"\nCodigo: "<< nuevo->codigo<<endl; 
			cout<<"Nombre :"<< nuevo->nombre<<endl; 
			nuevo = nuevo->der; 

		}while(nuevo != cab); 

	}else{
		cout<<"Lista vacia"; 
	}
}


void listarPila(void){
	if(cab != NULL){
		nuevo = new(Oficina); 	
		nuevo = cola; 
		do{
			cout<<"\nCodigo: "<< nuevo->codigo<<endl; 
			cout<<"Nombre :"<< nuevo->nombre<<endl; 
			nuevo = nuevo->izq; 

		}while(nuevo != cola); 

	}else{
		cout<<"Lista vacia"; 
	}
}




/*  ------------------------------------------  CODIGO DE LOS EMPLEADOS  ---------------------------------------------*/
void crearEmpleado(void){
int existe;
	nuevo = new(Empleado);


	cout <<"\n Ingrese el Codigo del empleado ";
	cin >>nuevo->codigo;
	fflush(stdin);
	
    cout<<"Ingrese el nombre : ";
    getline(cin,nuevo->nombre);
    cout<<"\n\n";
    fflush(stdin);

	cout <<"\n Ingrese el Sueldo del empleado:  ";
	cin >>nuevo->;
	fflush(stdin);
	
	
	nuevo->der = NULL;
	nuevo->izq = NULL;
		
	if ( !cab )	
	{
		cab = new(Oficina);
		cola = new(Oficina);
		cab = nuevo;
		cola = nuevo;
		
	}
	else
	{
		if ( nuevo->codigo >= cola->codigo )
		{
			if(nuevo->codigo > cola->codigo){
			nuevo->izq = cola;
			cola->der  = nuevo;
			cola       = nuevo;
			cola->der = cab; 
			cab->izq = cola; 
			}else{	
			cout<<"\n\n Codigo ya existe\n\n";
			} 
		}
		else
		{
			if ( nuevo->codigo <= cab->codigo )
			{
				if(nuevo->codigo < cab->codigo){
				nuevo->der = cab;
				cab->izq   = nuevo;
				cab        = nuevo;
				cab->izq = cola; 
				cola->der = cab;
				}else{	
				
				cout<<"\n\n Codigo ya existe\n\n";
				} 
			}
			else
			{
				bus1 = new(Oficina);
				bus2 = new(Oficina);
				bus1 = cab;
			 	bus2 = bus1->der;
			 	existe = 0;
			 	while ( existe == 0 )
			 	{
			 		if ( nuevo->codigo < bus2->codigo )
					{
					    nuevo->izq = bus1;
					    nuevo->der = bus2;
					    bus1->der  = nuevo;
					    bus2->izq  = nuevo;
					    existe = 8;
					} 
					else
					{
						bus1  = bus1->der;
						bus2  = bus2->der;	
					}
				}
				if( nuevo->codigo = bus2->codigo){

						cout<<"\n\n Codigo ya existe\n\n"; 
					}	
			}			
		}		
	}
}


void modificarEmpleado(void){
}


void borrarEmpleado(void){
}


void listar(void){
}



