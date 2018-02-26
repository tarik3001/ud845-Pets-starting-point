package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by thodzic on 2/21/18.
 */

//We make it a final class because it's just a class for providing constants and we wont need
    //to extend or implement anything for this outer class.
public final class PetContract {

    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private PetContract() {}

    // Inner class that defines the table contents
    public static class PetsEntry implements BaseColumns {
        public static final String TABLE_NAME = "pets";
        public static final String _ID = "id";
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";

        // Possible genders for our pets
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }
}
