interface Stockinterface {
    void addProductQuantity();
    void removeProductQuantity();
    default void totalProductQuantity(){}
}
