package dk.via.mithus.Shared;

public class Roles {
    public static Role Client;
    public static Role Administrator;
    public static Role LandLord;
    public static Role Moderator;
    public static Role Inactive;
    public static Role Pending;

    public Roles (Role client, Role administrator, Role landlord, Role moderator, Role inactive, Role pending) {
        Client = client;
        Administrator = administrator;
        LandLord = landlord;
        Moderator = moderator;
        Inactive = inactive;
        Pending = pending;
    }

    public Role getClient() {
        return Client;
    }

    public Role getAdministrator() {
        return Administrator;
    }

    public Role getLandLord() {
        return LandLord;
    }

    public Role getModerator() {
        return Moderator;
    }

    public Role getInactive() {
        return Inactive;
    }

    public Role getPending() {
        return Pending;
    }
}
