package users;

import methods.Printable;

abstract class User implements Printable {
    public void printRole() {
        System.out.println("User class: " + this.getClass().getSimpleName());
    }
}
