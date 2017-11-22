package exercise9;

/**
 * Class Ex9Converter
 * @author yasiro01
 */
public class Ex9Converter {
  public Double c2f(Double valueFrom) {
      return valueFrom * 9/5 + 32;
  }

  public Double c2k(Double valueFrom) {
      return valueFrom + 273.15;
  }

  public Double f2c(Double valueFrom) {
      return (valueFrom - 32) / 1.8;
  }

  public Double f2k(Double valueFrom) {
      return (valueFrom - 32) / 1.8 + 273.15;
  }

  public Double k2c(Double valueFrom) {
      return valueFrom - 273.15;
  }

  public Double k2f(Double valueFrom) {
      return (valueFrom - 273.15) * 1.8 + 32;
  }
}
