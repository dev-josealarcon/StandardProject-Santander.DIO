package SantanderDIO.gof.facade;

import subsystem1.crm.CrmService;
import subsystem2.cep.CepApi;

public class Facade {
	
	public void migrateCustomer(String name, String cep) {
		
		String city = CepApi.getInstance().recoverCity(cep);
		String state = CepApi.getInstance().recoverState(cep);
		
		CrmService.recordCustomer(name, cep, city, state);
	}
	
}
