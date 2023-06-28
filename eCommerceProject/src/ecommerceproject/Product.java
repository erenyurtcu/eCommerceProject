package ecommerceproject;

public class Product {
    
    private String productName,productColor,productCategory;
    private int productStockInformation,productWeight;
    private boolean inStock;
    private Test testProduct;
    
    public Product(String productName, String productColor, String productCategory, int productStockInformation, int productWeight, Test testProduct) {
        this.productName = productName;
        this.productColor = productColor;
        this.productCategory = productCategory;
        this.productStockInformation = productStockInformation;
        this.productWeight = productWeight;
        this.testProduct = testProduct;
        testProduct.productCreated(productName.toUpperCase(),productColor,productCategory,productWeight,productStockInformation);
        this.inStock = inStock;
        if (productStockInformation <= 0)
        {
            this.inStock  = false;
        }
        else
        {
            this.inStock = true;
        }
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public int getProductStockInformation() {
        return productStockInformation;
    }

    public void setProductStockInformation(int productStockInformation) {
        this.productStockInformation = productStockInformation;
    }

    public int getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(int productWeight) {
        this.productWeight = productWeight;
    }
    
    //boolean getter
    public boolean isInStock() {
        return inStock;
    }
    
    public void reduceTheAmount(int amount) {
            this.productStockInformation -= amount;
    }
}