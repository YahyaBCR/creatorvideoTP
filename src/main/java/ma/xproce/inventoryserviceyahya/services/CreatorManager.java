package ma.xproce.inventoryserviceyahya.services;

import ma.xproce.inventoryserviceyahya.entities.Creator;

import java.util.List;

public interface CreatorManager {
    public Creator addCreator(Creator creator);
    public boolean deleteCreator(Creator creator);
    public boolean deleteCreatorById(Integer id);
    public Creator updateCreator(Creator creator);

    public List<Creator> getAllCreators();
}
