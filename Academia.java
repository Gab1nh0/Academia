import java.util.*;
import java.util.Scanner;
public class Academia {
	//---------------------------------------------------------
	ArrayList<ArrayList<String>> alumnosList = new ArrayList();
	ArrayList<String> nombreAlum = new ArrayList();
	ArrayList<String> idenAlum = new ArrayList();
	ArrayList<String> edadAlum = new ArrayList();
	ArrayList<String> telAlum = new ArrayList();
	ArrayList<String> dirAlum = new ArrayList();
	//---------------------------------------------------------
	ArrayList<ArrayList<String>> cursosList = new ArrayList();
	ArrayList<String> codCur = new ArrayList();
	ArrayList<String> nomCur = new ArrayList();
	ArrayList<String> horasCur = new ArrayList();
	ArrayList<String> inicioCur = new ArrayList();
	ArrayList<String> finCur = new ArrayList();
	ArrayList<String> permitidosCur = new ArrayList();
	ArrayList<String> nombreProfcur = new ArrayList();
	ArrayList<String> idenProfcur = new ArrayList();
	ArrayList<String> contCur = new ArrayList();
	//---------------------------------------------------------
	ArrayList<ArrayList<String>> profesoresList = new ArrayList();
	ArrayList<String> nombreProf = new ArrayList();
	ArrayList<String> apeProf = new ArrayList();
	ArrayList<String> idenProf = new ArrayList();
	ArrayList<String> edadProf = new ArrayList();
	ArrayList<String> telProf = new ArrayList();
	ArrayList<String> dirProf = new ArrayList();
	//---------------------------------------------------------
	ArrayList<ArrayList<String>> empresaList = new ArrayList();
	ArrayList<String> nombreEmpre = new ArrayList();
	ArrayList<String> telEmpre = new ArrayList();
	ArrayList<String> dirEmpre = new ArrayList();
	ArrayList<String> nombreEstuempresa = new ArrayList();
	ArrayList<String> idenEstuempresa = new ArrayList();
	//----------------------------------------------------------
	ArrayList<ArrayList<String>> matriculaList = new ArrayList();
	ArrayList<String> persoMatriculada = new ArrayList();
	ArrayList<String> identMatriculada = new ArrayList();
	ArrayList<String> cursoMatriculada = new ArrayList();
	ArrayList<String> codiMatriculada = new ArrayList();
	ArrayList<String> notaMatriculada = new ArrayList();
	
	
	
	//poner que salgan los cursos disponibles en el registro de alumnos
	
	
	public void registroAlumnoslist() {
		Scanner entrada = new Scanner (System.in);
		String nombre, iden, edad, tel, dir;
		System.out.printf("================================Registro de Alumnos================================\n");
		System.out.printf("Ingrese el nombre del nuevo estudiante\n");
		nombre=entrada.nextLine();
		nombreAlum.add(nombre);
		System.out.printf("Ingrese la identificacion del nuevo estudiante\n");
		iden=entrada.nextLine();
		idenAlum.add(iden);
		System.out.printf("Ingrese la edad del nuevo estudiante\n");
		edad=entrada.nextLine();
		edadAlum.add(edad);
		System.out.printf("Ingrese el telefono del nuevo estudiante\n");
		tel=entrada.nextLine();
		telAlum.add(tel);
		System.out.printf("Ingrese la direccion del nuevo estudiante\n");
		dir=entrada.nextLine();
		dirAlum.add(dir);
	}
	
		
	public void registroEmpresa() {
		String n;
		String nombreEmp, telEmp, dirEmp, nombreEstu;
		Scanner entrada = new Scanner (System.in);
		System.out.printf("================================Registro de Empresas================================\n");
		System.out.printf("Ingrese la identificación del estudiante\n");
			n = entrada.nextLine();
			idenEstuempresa.add(n);
			int posicion = idenAlum.indexOf(n);
		    System.out.println("El nombre del estudiante es "+nombreAlum.get(posicion));
			System.out.printf("Ingrese el nombre de la empresa donde labora el nuevo estudiante\n");
			nombreEmp = entrada.nextLine();
			nombreEmpre.add(nombreEmp);
			System.out.printf("Ingrese el telefono de la empresa donde labora el nuevo estudiante\n");
			telEmp = entrada.nextLine();
			telEmpre.add(telEmp);
			System.out.printf("Ingrese la dirección de la empresa donde labora el nuevo estudiante\n");
			dirEmp = entrada.nextLine();
			dirEmpre.add(dirEmp);
			nombreEstu=nombreAlum.get(posicion);
			nombreEstuempresa.add(nombreEstu);
		}

	public void registroCursos() {
		String nombreProfecur;
		String cod, nom, horas, inicio, fin, permitidos, cedProf, cero="0";
		Scanner entrada = new Scanner (System.in);
		System.out.printf("================================Registro de Cursos================================\n");
		System.out.printf("Ingrese el codigo del nuevo curso\n");
		cod=entrada.nextLine();
		codCur.add(cod);
		System.out.printf("Ingrese el nombre del nuevo curso\n");
		nom=entrada.nextLine();
		nomCur.add(nom);
		System.out.printf("Ingrese la horas de duracion del nuevo curso\n");
		horas=entrada.nextLine();
		horasCur.add(horas);
		System.out.printf("Ingrese la fecha de inicio del curso\n");
		inicio=entrada.nextLine();
		inicioCur.add(inicio);
		System.out.printf("Ingrese la fecha del fin del curso\n");
		fin=entrada.nextLine();
		finCur.add(fin);
		System.out.printf("Ingrese el total de estudiantes permitidos en el curso\n");
		permitidos=entrada.nextLine();
		permitidosCur.add(permitidos);
		System.out.printf("Ingrese la cedula del profesor(a) encargado del curso\n");
		cedProf=entrada.nextLine();
		idenProfcur.add(cedProf);
		contCur.add(cero);
		int posicion = idenProf.indexOf(cedProf);
		nombreProfecur=nombreProf.get(posicion)+" "+apeProf.get(posicion);
		nombreProfcur.add(nombreProfecur);
		System.out.printf("El profesor(a) encargado del curso será: "+nombreProfcur.get(posicion)+"\n");
	}
	
	public void registroProfesor() {
		String nomProf, apelliProfe, idProf, edadProfe, telProfe, dirProfe; 
		Scanner entrada = new Scanner (System.in);
		System.out.printf("================================Registro de Profesores================================\n");
		System.out.printf("Ingrese el nombre del nuevo profesor(a)\n");
		nomProf=entrada.nextLine();
		nombreProf.add(nomProf);
		System.out.printf("Ingrese el apellido del nuevo profesor(a)\n");
		apelliProfe=entrada.nextLine();
		apeProf.add(apelliProfe);
		System.out.printf("Ingrese la identificacion del nuevo profesor(a)\n");
		idProf=entrada.nextLine();
		idenProf.add(idProf);
		System.out.printf("Ingrese la edad del nuevo profesor(a)\n");
		edadProfe=entrada.nextLine();
		edadProf.add(edadProfe);
		System.out.printf("Ingrese el telefono del nuevo profesor(a)\n");
		telProfe=entrada.nextLine();
		telProf.add(telProfe);
		System.out.printf("Ingrese la dirección del nuevo profesor(a)\n");
		dirProfe=entrada.nextLine();
		dirProf.add(dirProfe);
	}
	
	public void matricularCurso() {
		String nombre, codigo, curso, iden, suma, nota;
		String n, cod, mensaje="";
		int  fila=0, filae=0;
        int pos=0;
        String resta, uno="1", cero="0";
        
		Scanner entrada = new Scanner (System.in);
		System.out.printf("================================Matricularse en Curso================================\n");
		System.out.printf("Ingrese la identificación del estudiante\n");
		n = entrada.nextLine();
		int posicion = idenAlum.indexOf(n);
		System.out.printf("El estudiante es: "+nombreAlum.get(posicion)+"\n");
		System.out.printf("================================Cursos================================\n");
		for(int i = 0; i < nomCur.size(); i++) {
			int condicionador = Integer.parseInt(permitidosCur.get(i));
			if(condicionador==0) {
				System.out.printf("");
			}else {
				System.out.println("Curso: "+nomCur.get(i)+"|| Cod: "+codCur.get(i)+"|| Plazas restantes: "+permitidosCur.get(i));
			}
			
			
		}
		System.out.println("Introduce el codigo del curso");
		cod=entrada.nextLine();
		int posicionCur = codCur.indexOf(cod);
		mensaje=(nombreAlum.get(posicion)+" se ha matriculado correctamente en el curso: "+nomCur.get(posicionCur));
		System.out.println(mensaje);
		suma=String.valueOf(Integer.parseInt(contCur.get(posicionCur))+Integer.parseInt(uno));
		resta=String.valueOf(Integer.parseInt(permitidosCur.get(posicionCur))-Integer.parseInt(uno));
		contCur.set(posicionCur, suma);
		permitidosCur.set(posicionCur,resta);
		System.out.println("La cantidad de matriculados en este curso es de "+contCur.get(posicionCur));
		
		
		nombre=nombreAlum.get(posicion);
		iden=idenAlum.get(posicion);
		codigo=codCur.get(posicionCur);
		curso=nomCur.get(posicionCur);
		
		notaMatriculada.add(cero);
		identMatriculada.add(iden);
		persoMatriculada.add(nombre);
		cursoMatriculada.add(curso);
		codiMatriculada.add(codigo);
		

	}
	
	public void ingresarNotas() {
		String nombre, codigo, curso, x, suma;
		String n, cod, mensaje="", nota="";
		int  fila=0, filae=0;
        int pos=0;
        String resta, uno="1", cero="0";
        
		Scanner entrada = new Scanner (System.in);
		System.out.printf("================================Registrar Notas================================\n");
		System.out.printf("Ingrese la identificación del estudiante\n");
		n = entrada.nextLine();
		int posicion = idenAlum.indexOf(n);
		System.out.println("El estudiante es: "+nombreAlum.get(posicion));
		System.out.println("Ingrese el codigo de la materia");
		cod = entrada.nextLine();
		int posicionCur = codiMatriculada.indexOf(cod);
		System.out.println("El curso es: "+cursoMatriculada.get(posicionCur));
		System.out.println("Ingrese la nota del curso");
		nota = entrada.nextLine();
		notaMatriculada.set(posicionCur,nota);
		System.out.println("La calificacion es "+notaMatriculada.get(posicionCur));
		System.out.println("La nota se ha guardado correctamente");
	}
	
	public void consultaUno() {
		String n;
		Scanner entrada = new Scanner (System.in);
		System.out.printf("================================Cursos Matriculados Por Un Estudiantes================================\n");
		System.out.println("Introduzca el codigo del curso matriculado");
		n = entrada.nextLine();
		int posicion = codCur.indexOf(n);
		System.out.println("Curso: "+nomCur.get(posicion));
		System.out.println("Profesor: "+nombreProfcur.get(posicion));
	}
	
	public void consultaDos() {
		int posicion = contCur.indexOf(Collections.max(contCur));
		System.out.printf("Es "+nomCur.get(posicion));
		System.out.println(" con "+Collections.max(contCur)+" estudiantes");
		
	}
	
	public void consultaTres() {
		String x, codigoCurso; 
		Scanner entrada = new Scanner (System.in);
		System.out.printf("================================Cursos Dictados Por Un Profesora================================\n");
		System.out.println("Introduzca el codigo del curso");
		codigoCurso = entrada.nextLine();
		int posicion = codCur.indexOf(codigoCurso);
		System.out.println("Curso: "+nomCur.get(posicion));
		System.out.println("Profesor: "+nombreProfcur.get(posicion));
		System.out.println("Horas: "+horasCur.get(posicion));
		System.out.println("Inicio: "+inicioCur.get(posicion));
	}
		
	public void consultaCuatro() {
		int res;
		String n, cod;
		Scanner entrada = new Scanner (System.in);
		System.out.printf("================================Cursos Tomados por un Estudiante y sus calificaciones================================\n");
		System.out.printf("Ingrese el nombre del estudiante\n");
		n = entrada.nextLine();
		int posicion = persoMatriculada.indexOf(n);
		System.out.println("El estudiante es: "+persoMatriculada.get(posicion));
		for (int i =posicion; i<persoMatriculada.size(); i++) {
					if(persoMatriculada.get(i)==persoMatriculada.get(posicion)) 
						System.out.println("El curso es: "+cursoMatriculada.get(i));
						System.out.println("La calificacion es "+notaMatriculada.get(i));
		}
	}
	public void consultaCinco() {
		System.out.printf("================================Estudiantes Que Pertenecen A Empresa================================\n");
		for(int i = 0; i < nombreEmpre.size(); i++) {
			System.out.println("El nombre del estudiante es: "+nombreEstuempresa.get(i));
			System.out.println("La ididentificacion del estudiante es: "+idenEstuempresa.get(i));
			System.out.println("El nombre de la empresa donde labora el estudiante es : "+nombreEmpre.get(i));
			System.out.println("El telefono de la empresa donde labora el estudiante es: "+telEmpre.get(i));
			System.out.println("La direccion de la empresa donde labora el estudiante es: "+dirEmpre.get(i));
		}
	}

	public static void main(String [] ar){
    	
    	Academia ac = new Academia();
    	Scanner entrada = new Scanner (System.in);
    	int elecion = 0;
    	int opcion = 0;
    			do {
    				System.out.printf("================================Academia================================\n"
   						 + "1. Registro de Alumnos\n"
   						 + "2. Registro de Empresa\n"
   						 + "3. Registros de Profesores\n"
   						 + "4. Registros de Cursos\n"
   						 + "5. Matricularse en curso\n"
   						 + "6. Registro de la Nota\n"
   						 + "7. Consultas\n"
   						 + "8.  Salir\n\n");
    	                        opcion=entrada.nextInt();
    						
    				switch (opcion) {
    				case 1:
    				ac.registroAlumnoslist();
    					break;
    				case 2:
    				ac.registroEmpresa();	
    					break;
    				case 3:
    				ac.registroProfesor();
    					break;
    				case 4:
    				ac.registroCursos();
    					break;
    				case 5:
    				ac.matricularCurso();	
    					break; 
    				case 6:
    				ac.ingresarNotas();	
    					break;
    				case 7:
    					do {
    						System.out.printf("================================Consultas================================\n"
    								 + "1. 	Consulta de Cursos matriculados por un estudiante X\n"
    								 + "2. 	Curso con mayor número de estudiantes matriculados\n"
    								 + "3. 	Cursos dictados por un profesor X\n"
    								 + "4. 	Listado de Cursos Tomados por un Estudiante X y sus calificaciones\n"
    								 + "5. 	Lista de estudiantes que pertenecen a empresa\n"
    								 + "6.  Volver al menu principal\n\n");
    						elecion=entrada.nextInt();
    								
    						switch (elecion) {
    						case 1:
    							ac.consultaUno();
    							break;
    						case 2:
    							ac.consultaDos();
    							break;
    						case 3:
    							ac.consultaTres();
    							break;
    						case 4:
    							ac.consultaCuatro();
    							break;
    						case 5:
    							ac.consultaCinco();
    							break; 
    						case 6:
    						ac.main(null);
    							break;
    						default:
    							break;
    						}
    					} while (elecion !=8);
    					break;
    				case 8:
    					System.exit(0);
    					break;
    				default:
    					break;
    				}
    			} while (opcion !=8);

    	}  
 
}