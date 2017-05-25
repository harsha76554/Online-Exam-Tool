package harsha.bth.App.process;

import harsha.bth.App.db.entity.Email;

import javax.ws.rs.core.Response;

public interface EmailProcess {

    Integer send(Email email);
}
