package core.basesyntax.dao;

public interface StorageDao {
    void addFruit(String fruit, Integer quantity);

    Integer getQuantity(String fruit);

    void mergeQuantity(String fruit, int quantity);

    boolean containsFruit(String fruit);
}