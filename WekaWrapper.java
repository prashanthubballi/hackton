package weka.classifiers;

import weka.core.Attribute;
import weka.core.Capabilities;
import weka.core.Capabilities.Capability;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.RevisionUtils;
import weka.classifiers.Classifier;
import weka.classifiers.AbstractClassifier;

public class WekaWrapper
  extends AbstractClassifier {

  /**
   * Returns only the toString() method.
   *
   * @return a string describing the classifier
   */
  public String globalInfo() {
    return toString();
  }

  /**
   * Returns the capabilities of this classifier.
   *
   * @return the capabilities
   */
  public Capabilities getCapabilities() {
    weka.core.Capabilities result = new weka.core.Capabilities(this);

    result.enable(weka.core.Capabilities.Capability.NOMINAL_ATTRIBUTES);
    result.enable(weka.core.Capabilities.Capability.NUMERIC_ATTRIBUTES);
    result.enable(weka.core.Capabilities.Capability.DATE_ATTRIBUTES);
    result.enable(weka.core.Capabilities.Capability.MISSING_VALUES);
    result.enable(weka.core.Capabilities.Capability.NOMINAL_CLASS);
    result.enable(weka.core.Capabilities.Capability.MISSING_CLASS_VALUES);


    result.setMinimumNumberInstances(0);

    return result;
  }

  /**
   * only checks the data against its capabilities.
   *
   * @param i the training data
   */
  public void buildClassifier(Instances i) throws Exception {
    // can classifier handle the data?
    getCapabilities().testWithFail(i);
  }

  /**
   * Classifies the given instance.
   *
   * @param i the instance to classify
   * @return the classification result
   */
  public double classifyInstance(Instance i) throws Exception {
    Object[] s = new Object[i.numAttributes()];
    
    for (int j = 0; j < s.length; j++) {
      if (!i.isMissing(j)) {
        if (i.attribute(j).isNominal())
          s[j] = new String(i.stringValue(j));
        else if (i.attribute(j).isNumeric())
          s[j] = new Double(i.value(j));
      }
    }
    
    // set class value to missing
    s[i.classIndex()] = null;
    
    return WekaClassifier.classify(s);
  }

  /**
   * Returns the revision string.
   * 
   * @return        the revision
   */
  public String getRevision() {
    return RevisionUtils.extract("1.0");
  }

  /**
   * Returns only the classnames and what classifier it is based on.
   *
   * @return a short description
   */
  public String toString() {
    return "Auto-generated classifier wrapper, based on weka.classifiers.trees.J48 (generated with Weka 3.9.3).\n" + this.getClass().getName() + "/WekaClassifier";
  }

  /**
   * Runs the classfier from commandline.
   *
   * @param args the commandline arguments
   */
  public static void main(String args[]) {
    runClassifier(new WekaWrapper(), args);
  }
}

class WekaClassifier {

  public static double classify(Object[] i)
    throws Exception {

    double p = Double.NaN;
    p = WekaClassifier.N102c84312(i);
    return p;
  }
  static double N102c84312(Object []i) {
    double p = Double.NaN;
    if (i[3] == null) {
      p = 0;
    } else if (((Double) i[3]).doubleValue() <= 6.47) {
    p = WekaClassifier.Nc24c2813(i);
    } else if (((Double) i[3]).doubleValue() > 6.47) {
    p = WekaClassifier.N1a83ceb17(i);
    } 
    return p;
  }
  static double Nc24c2813(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= 7.04) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() > 7.04) {
    p = WekaClassifier.N12dbef614(i);
    } 
    return p;
  }
  static double N12dbef614(Object []i) {
    double p = Double.NaN;
    if (i[4] == null) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() <= 6.55) {
      p = 0;
    } else if (((Double) i[4]).doubleValue() > 6.55) {
    p = WekaClassifier.N60077015(i);
    } 
    return p;
  }
  static double N60077015(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 6.57) {
    p = WekaClassifier.N10192af16(i);
    } else if (((Double) i[1]).doubleValue() > 6.57) {
      p = 1;
    } 
    return p;
  }
  static double N10192af16(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() <= 7.42) {
      p = 0;
    } else if (((Double) i[8]).doubleValue() > 7.42) {
      p = 1;
    } 
    return p;
  }
  static double N1a83ceb17(Object []i) {
    double p = Double.NaN;
    if (i[8] == null) {
      p = 1;
    } else if (((Double) i[8]).doubleValue() <= 7.0) {
    p = WekaClassifier.N102e82618(i);
    } else if (((Double) i[8]).doubleValue() > 7.0) {
    p = WekaClassifier.Ncaf7aa22(i);
    } 
    return p;
  }
  static double N102e82618(Object []i) {
    double p = Double.NaN;
    if (i[11] == null) {
      p = 0;
    } else if (((Double) i[11]).doubleValue() <= 7.77) {
    p = WekaClassifier.N1733af119(i);
    } else if (((Double) i[11]).doubleValue() > 7.77) {
      p = 1;
    } 
    return p;
  }
  static double N1733af119(Object []i) {
    double p = Double.NaN;
    if (i[1] == null) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() <= 7.08) {
      p = 0;
    } else if (((Double) i[1]).doubleValue() > 7.08) {
    p = WekaClassifier.Ne04fda20(i);
    } 
    return p;
  }
  static double Ne04fda20(Object []i) {
    double p = Double.NaN;
    if (i[9] == null) {
      p = 0;
    } else if (((Double) i[9]).doubleValue() <= 7.76) {
    p = WekaClassifier.Nef6fc921(i);
    } else if (((Double) i[9]).doubleValue() > 7.76) {
      p = 1;
    } 
    return p;
  }
  static double Nef6fc921(Object []i) {
    double p = Double.NaN;
    if (i[12] == null) {
      p = 0;
    } else if (((Double) i[12]).doubleValue() <= 7.0) {
      p = 0;
    } else if (((Double) i[12]).doubleValue() > 7.0) {
      p = 1;
    } 
    return p;
  }
  static double Ncaf7aa22(Object []i) {
    double p = Double.NaN;
    if (i[2] == null) {
      p = 1;
    } else if (((Double) i[2]).doubleValue() <= 6.4) {
    p = WekaClassifier.Naceeb023(i);
    } else if (((Double) i[2]).doubleValue() > 6.4) {
      p = 1;
    } 
    return p;
  }
  static double Naceeb023(Object []i) {
    double p = Double.NaN;
    if (i[7] == null) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() <= 6.9) {
      p = 0;
    } else if (((Double) i[7]).doubleValue() > 6.9) {
      p = 1;
    } 
    return p;
  }
}
