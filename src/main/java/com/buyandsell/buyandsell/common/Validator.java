package com.buyandsell.buyandsell.common;

import com.buyandsell.buyandsell.model.User;

public class Validator {

    public static Boolean isValidUser(User user) {

        if (user != null)
            if ((user.getName() != null) && !user.getName().isEmpty())
                if ((user.getEmail() != null) && (!user.getEmail().isEmpty()))
                    if ((user.getUname() != null) && !user.getUname().isEmpty())
                        return true;
                    else
                        return false;
                else
                    return false;
            else
                return false;
        else
            return false;
    }
}
