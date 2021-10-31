# Projecte League 

Desenvolupar una aplicació per gestionar equips i jugadors d'una lliga esportiva. Les funcionalitats que cal desenvolupar son les típiques CRUD, així com l'alta i la baixa de jugadors a un equip. Cal considerar a més quines cerques poden ser necessàries en l'aplicació, com per exemple obtenir tots els jugadors d'un equip.

Dels equips (Team) volem saber el nom (name), l'entrenador (coach), la categoria (category) i el pressupost (budget). El nom de l'equip ha de ser únic.

Dels jugadors (Player) volem saber nom (name), cognoms (surname), data de naixement (birthdate) i salari (salary). El nom complet (nom i cognoms) ha de ser únic (fullname).

Les claus úniques de cada entitat no es poden modificar al repositori de dades. En la implementació de la persistència, cal que cada entitat tingui una clau primària (PK) autoincremental id (gestionada pel sistema de persistència). Les relacions entre entitats s'aconsegueixen a través dels id (PK).

Un jugador pot participar en zero o un únic equip i a cada equip hi participen zero o diversos jugadors. La suma de salaris dels jugadors d'un equip no pot sobrepassar el seu pressupost.

L'aplicació ha de ser multiusuari i concurrent, així que, les dades dels equips i els jugadors s'han d'emmagatzemar a un servidor. Per accedir i administrar les dades del servidor desenvoluparem controladors Servlet i serveis web.

Cal definir també l'estructura i gestió de les dades dels usuaris de l'aplicació. Els usuaris tenen un nom (username), una paraula de pas (password) i un rol (role). En funció del rol, tindran permisos diferents i podran executar accions diferents a l'aplicació. El rol de l'usuari defineix els permisos que té sobre l'aplicació (consulta de dades, modificació, administració, …).

L’accés a les dades des de client es fa amb una aplicació híbrida mòbil programada amb el framework Ionic. A la banda del servidor, les peticions es respondran mitjançant servlets i serveis web.

L'aplicació ha de contenir al model un joc de dades de prova prou complet per poder provar totes les funcionalitats.

Cal documentar correctament l'aplicació. A cada mètode cal concretar-ne el comportament en totes les situacions.

És requisit imprescindible la captura i tractament de tots els errors, donar l'adequada retroacció a l'usuari i que l'aplicació respongui sense fallar en cap situació.
