package metier.clients;

import metier.authentification.IServiceIHM;

public interface IServiceIHMClient extends IServiceIHM {

    
    int menuRetrait();
    int menuInformations();
    int menuModification();
}
