package src.com.essentials.java.functional;

import java.util.List;
import java.util.function.Supplier;

/*
 *
 * Supplier interface, there is no requirement that a new or distinct result be returned each time the supplier is invoked.
 *
 * */
public class SupplierInterface extends FunctionBase {
    @Override
    public void function() {
        System.out.println("Supplier interface, there is no requirement that a new or distinct result be returned each time the supplier is invoked.");
        System.out.println(getDBConnectionUrl());
        System.out.println("Supplier " + getDBConnectionUrlSupplier.get());
        System.out.println("Supplier list " + getListDBConnectionUrlSupplier.get());

    }

    static Supplier<String> getDBConnectionUrlSupplier = () -> "jdb://localhost:5454/db";
    static Supplier<List<String>> getListDBConnectionUrlSupplier = () ->  List.of("jdb://localhost:5454/db", "jdb://localhost:5454/user");

    static String getDBConnectionUrl() {
        return "jdb://localhost:5454/db";
    }
}
