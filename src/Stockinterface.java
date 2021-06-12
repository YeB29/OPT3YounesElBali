interface Stockinterface {
    void addProductQuantity(int keuze);
    void removeProductQuantity(int keuze);
    default void totalProductQuantity(){}
}
