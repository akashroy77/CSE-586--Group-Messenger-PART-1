package edu.buffalo.cse.cse486586.groupmessenger1;


//https://developer.android.com/training/data-storage/sqlite.html
import android.provider.BaseColumns;

public final class KeyValueTableContract {
    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private KeyValueTableContract() {}

    /* Inner class that defines the table contents */
    public static class KeyValueTableEntry implements BaseColumns
    {
        public static final String TABLE_NAME = "keyValueTable";
        public static final String COLUMN_NAME_KEY = "key";
        public static final String COLUMN_NAME_VALUE = "value";
    }

}
