INFORMAZIONI GENERALI RIGUARDO AL PROGETTO: "CARTELLA_SANITARIA"

Benvenuti nella cartella del progetto,
all'interno di quest'ultima si può trovare:
1) File PDF del progetto richiesto
2) File UML in formato png, esso è stato generato all'interno del progetto java tramite un
   apposito plugin "objectaid", è dunque naturale non riuscire ad aprirlo all'interno del IDE se non si
   dispone del plugin.
3) Una cartella "file_salvataggi", al suo interno vengono salvati ed estrapolati i file in cui risiedono i dati
   di una sessione di lavoro con la console.
   Il programma dovrebbe teoricamente trovare in modo automatico il path, se così non fosse esso è modificabile 
   al interno della classe "Main".
4) La cartella "src" da cui con il path "src\it\unibs\cartella_sanitaria" si arriva a vedere la divisione delle classi.
   Il codice è stato suddiviso nei classici package:
	- model: per tutto ciò che esegue calcoli e funzioni
	- view: per ciò che serve ai fini di visualizzazioni in output di dati
	- menu: contenente i menu di creazioni di dati e di avvio sessione 
   Esterno ai package è presente il metodo Main, da cui parte il programma.
5) Vi è poi nel path "\src\libreria_sibilia" la mia libreria personale con i metodi che ho creato e utilizzato.
   Tra di essi vi è un package per la costruzione automatica del codice fiscale, esso è stato preso da internet e poi
   modificato ed adattato per funzionare senza intoppi all'interno dell'intero programma.
6) Nel path "\src\it\unibs\fp" invece vi sono le classi fornite dal professor Serina.

AVVIO DEL PROGRAMMA
Una volta avviato il programma, tramite la console l'utente sarà sempre guidato nella costruzione e visualizzazione
di ogni parte che compone la cartella santaria.
Tra le prime voci vi sono quelle per poter caricare o salvare i dati della sessione, i nomi dei file salvati sono scelti
dall'utente tramite input da tastiera.

PER CARICARE IL FILE DI TEST GIA' COSTRUITO è NECESSARIO
1) Avviare il programma.
2) Scegliere la voce "carica dati", dando in input il numero "2".
3) Scrivere il nome del file che contiene già i dati di test: "paziente_esempio".

Creato dallo studente: Riccardo Siblia, mat: 727607, università degli studi di Brescia, AA 2022/20223.