package fr.initiativedeuxsevres.ttm.domain.models;

public enum SecteursActivites {
    SERVICES_ADMINISTRATIFS_SOUTIEN("Services administratifs et soutien"),
    ACTIVITES_TECHNIQUES_SCIENTIFIQUES("Activités spécialisées, techniques et scientifiques"),
    AGRICULTURE("Agriculture, sylviculture et pêche"),
    ARTS_SPECTACLES("Arts, spectacles et activités récréatives"),
    COMMERCE("Commerce et réparation"),
    CONSTRUCTION_BTP("Contruction_BTP"),
    ENSEIGNEMENT("Enseignement"),
    HOTELS_RESTAURANTS("Hôtels, cafés et restaurant"),
    INDUSTRIE("Industrie"),
    INFORMATION_COMMUNICATION("Information et communication"),
    EAU_ASSAINISSEMENT_DECHETS("Eau, assainissement, gestion des déchets et dépollution"),
    ELECTRICITE_GAZ("Electricité, gaz, vapeur d'air conditionné"),
    SANTE_ACTION_SOCIALE("Santé humaine et action sociale"),
    SERVICES_AUX_ENTREPRISES("Services aux entreprises"),
    SERVICES_AUX_PARTICULIERS("Services aux particuliers"),
    TRANSPORTS("Transport");

    public final String name;
    SecteursActivites(String name) {
        this.name = name;
    }


}
