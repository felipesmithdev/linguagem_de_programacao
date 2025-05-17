package sptech.school;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Stock {

    @JsonProperty("symbol")
    private String symbol;

    @JsonProperty("companyName")
    private String companyName;

    @JsonProperty("price")
    private double price;

    @JsonProperty("volume")
    private long volume;

    @JsonProperty("date")
    private String date;

    // Getters e setters
    public String getSymbol() { return symbol; }
    public void setSymbol(String symbol) { this.symbol = symbol; }

    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public long getVolume() { return volume; }
    public void setVolume(long volume) { this.volume = volume; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }


}
