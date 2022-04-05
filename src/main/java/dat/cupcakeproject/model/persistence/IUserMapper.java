package dat.cupcakeproject.model.persistence;

import dat.cupcakeproject.model.entities.User;
import dat.cupcakeproject.model.exceptions.DatabaseException;

public interface IUserMapper
{
    public User login(String email, String kodeord) throws DatabaseException;
    public User createUser(String username, String password, String role) throws DatabaseException;
}
