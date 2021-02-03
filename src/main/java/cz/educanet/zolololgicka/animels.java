package main.java.cz.educanet.zolololgicka;

public class animels {
    private String species;
    private String name;
    private short birthyear;
    private voretype diet;
    private pavilons habitat;
    private lifesegment status;
    private genders gender;


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(short birthyear) {
        this.birthyear = birthyear;
    }

    public voretype getDiet() {
        return diet;
    }

    public void setDiet(voretype diet) {
        this.diet = diet;
    }

    public pavilons getHabitat() {
        return habitat;
    }

    public void setHabitat(pavilons habitat) {
        this.habitat = habitat;
    }

    public lifesegment getStatus() {
        return status;
    }

    public void setStatus(lifesegment status) {
        this.status = status;
    }

    private enum voretype {
        CARNIVORE, OMNIVORE, HERBIVORE, NO_INTAKE, INSECTS
    }

    private enum pavilons {
        A1, A2, A3, B1, B2, B3, C1, C2, C3, CAFETERIA
    }

    private enum lifesegment {
        UNBORN, YOUNG, ADULT, OLD, DYING, DEAD, UNKNOWN
    }

    private enum genders {
        AGENDER, ANDROGYNE, APORAGENDER, AUTIGENDER, BIGENDER, CISGENDER, DEMIBOY, DEMIGIRL, GENDERFLUID, GENDERFLUX, GENDERQUEER, QUESTIONING, MAN, MAVERIQUE, NEUTROIS, NONBINARY, PANGENDER, POLYGENDER, THIRD, TRANSFEMININE, TRANSGENDER, TRANSMASCULINE, TRIGENDER, TWOSPIRIT, WOMAN, KETCHUP, KETCHUP_BOTTLE, BOTTLE, ATTACK_HELICOPTER, HELICOPTER, LEGO, NONE, OTHER, COCACOLA_GLASS, YES, NO, BISCUIT, CHOCOLATE_CHIP_COOKIE, NEUTRAL, HERMAPHRODITE, INTERSEX, MTF, FTM, NONCONFORMING, NEITHER, FURRY, AI, SPIRIT, GOD, VODKA, RUSSIA, BORON, PLANT, LAUNDRY, FINGERLESS, KOLECHIA, ARSTOTZKA, DISCORD, MLP, MICROSOFT_WINDOWS, GABE_NEWELL, HALF_LIFE_3, CHOMPSKI, G_MAN, SPOTIFY, POP_TART, GOOGLE, REPTILIAN, FLAT_EARTHER, CACTUS, URANUS, MARS, ZEUS_X27, PHIL_SWIFT, CUM, DOOMGUY, TI_83_GRAPHING_CALCULATOR, ASIA, POPE, DECEASED, AVAST_FREE_ANTIVIRUS, AVAST_PREMIUM_SECURITY, PORNHUB_PREMIUM, MUSTARD, ORANGE, GREEN, APPLE, PEAR, EXTRATERRESTRIAL, F16, NOKIA_3310, NOKIA_6310I, QUEEN_OF_ENGLAND, BIG_BEN, HEROBRINE, STEVE_HARVEY, PEW_DIE_PIE, CHARGED_ELECTRON, MICHAEL_REEVES, DING_DING, REAL_SCOUT_TF2, ALIEXPRESS, SANS_UNDERTALE, PROGRAMMABLE_DOORBELL, OBAMA_PRISM, PICO, CHICO, COCO, WEEB, DISCORD_MODERATOR, DE_DUST2, THOMAS_THE_THERMONUCLEAR_BOMB, THE_KAREN, KAREL, SYSTEM32, HENTAI, SHOTACON, LOLICON, PAVEL, JOHN_WICK_FROM_FORTNITE, YOUTUBE_BUDDY, SUSAN_WOJICKI, THE_POKEMON_COMPANY, POKEMON, VLADIMIR_PUTIN, GLOBGOGABGALAB_THE_SCHWABBLE_DABBLE_WABBLE_GABBLE_FLIBBA_BLABBA_BLAB, GLIB_A, SMASH_MOUTH, SHREK, SCOTLANDIA, DIHYDROGEN_MONOXIDE, BIG_CHUNGUS, SMALL_CHUNGUS, MEDIUM_CHUNGUS, REGGIE, EXPLOSIVE_ORDINANCE, SENTRY, SCENT_TREE, GENETIC_LIFEFORM_AND_DISK_OPERATING_SYSTEM, LITAJICI_KAMEN, MAYONNAISE, IRELAND, H3NTAI, CHAD_THUNDERCOCK, CATGIRL, SLIGHTLY_TECHNOLOGICALLY_EDITED_MALE, AVAST_ANTIVIRUS, STURMGEWEHR_1944, FUCKING_UHHHH, PAPRIKA
    }
}
