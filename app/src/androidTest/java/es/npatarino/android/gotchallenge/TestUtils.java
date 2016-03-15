package es.npatarino.android.gotchallenge;

import java.util.LinkedList;
import java.util.List;

import es.npatarino.android.gotchallenge.domain.GoTCharacter;
import es.npatarino.android.gotchallenge.domain.GoTHouse;

/**
 * @author Antonio López.
 */
public class TestUtils {

    private static final GoTCharacter KHAL_DROGO = new GoTCharacter();
    private static final String KHAL_DROGO_NAME = "Khal Drogo";
    private static final String KHAL_DROGO_URL = "https://s3-eu-west-1.amazonaws.com/npatarino/got/8310ebeb-cdda-4095-bd5b-f59266d44677.jpg";
    private static final String KHAL_DROGO_DESCRIPTION = "Any description is good";
    private static final GoTHouse STARK_HOUSE = new GoTHouse();
    private static final String STARK_ID = "f96537a9";
    private static final String STARK_NAME = "House Stark";

    public static GoTHouse defaultGotHouse() {
        GoTHouse house = STARK_HOUSE;
        house.setHouseId(STARK_ID);
        house.setHouseName(STARK_NAME);
        house.setHouseImageUrl(KHAL_DROGO_URL);
        return house;
    }

    public static List<GoTCharacter> getCharacters(int numberOfGotCharacters) throws Exception {
        List<GoTCharacter> characters = new LinkedList<>();
        for (int i = 0; i < numberOfGotCharacters; i++){
            characters.add(defaultGotCharacter());
        }
        return characters;
    }

    public static GoTCharacter defaultGotCharacter(){
        GoTCharacter gotCharacter = KHAL_DROGO;
        gotCharacter.setName(KHAL_DROGO_NAME);
        gotCharacter.setImageUrl(KHAL_DROGO_URL);
        gotCharacter.setDescription(KHAL_DROGO_DESCRIPTION);
        gotCharacter.setHouseId(STARK_ID);
        gotCharacter.setHouseName(STARK_NAME);
        gotCharacter.setHouseImageUrl(KHAL_DROGO_URL);
        return gotCharacter;
    }


}
