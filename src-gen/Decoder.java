// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/Decoder.gold"
import gold.*;
import gold.structures.*;
import gold.structures.automaton.*;
import gold.structures.bag.*;
import gold.structures.collection.*;
import gold.structures.deque.*;
import gold.structures.disjointset.*;
import gold.structures.graph.*;
import gold.structures.heap.*;
import gold.structures.list.*;
import gold.structures.map.*;
import gold.structures.multimap.*;
import gold.structures.point.*;
import gold.structures.queue.*;
import gold.structures.set.*;
import gold.structures.stack.*;
import gold.structures.tree.*;
import gold.structures.tree.binary.*;
import gold.structures.tree.nary.*;
import gold.structures.tuple.*;
import gold.structures.turingMachine.*;
import gold.swing.*;
import gold.swing.icon.*;
import gold.swing.icon.ajaxload.*;
import gold.swing.icon.famfamfam.*;
import gold.swing.icon.gold.*;
import gold.swing.icon.jlfgr.*;
import gold.swing.icon.wikimedia.*;
import gold.swing.icon.windows.*;
import gold.swing.look.*;
import gold.swing.util.*;
import gold.test.*;
import gold.test.automaton.*;
import gold.test.general.*;
import gold.test.graph.*;
import gold.util.*;
import gold.visualization.*;
import gold.visualization.automaton.*;
import gold.visualization.graph.*;
import gold.visualization.quadtree.*;
import gold.visualization.turingMachine.*;
import gold.visualization.util.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class Decoder {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static Object Alph=null;
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=26;
      if ($opEqualY($invokeField("length",args),0)) {
        $line=26;
        Alph=$fix(GCollections.asSet('a','b','c','d'));
      }
      else {
        $line=28;
        gold.structures.set.ISet $v1=$newSet();
        int $v3=$int(0);
        int $v4=$int($invokeMethod("length",((java.lang.String[])args)[$int(0)],new Object[]{}))-1;
        $v2:for (int i=$v3; i<=$v4; i++) {
          $v1.add($invokeMethod("charAt",((java.lang.String[])args)[$int(0)],new Object[]{i}));
        }
        Alph=$fix($opDiffeY($v1,GCollections.asSet('$','#')));
      }
      $line=33;
      Object deCoder=$fix(Decoder.createTransducer(Alph));
      $line=34;
      System.out.println($message(new Object[]{$opAdditY($opAdditY($opAdditY($opAdditY("Input strings of the form xyz:W#. with x, y, over ",Alph),"and W  over   "),Alph),"* (end with an empty string)")}));
      $line=37;
      Utilities.test($cast(gold.structures.automaton.IAutomaton.class,deCoder));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Decoder.class,"main",$line);
    }
  }
  public static Object cutString(String reading) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=43;
      char[] characters=$cast(char[].class,$fix(((java.lang.String)reading).toCharArray()));
      $line=44;
      Integer len=$cast(Integer.class,$fix(0));
      $line=45;
      String out=$cast(String.class,$fix(""));
      $line=47;
      while (true) {
        if (!($opLesstY(len,3))) break;
        $line=48;
        out=$cast(String.class,$fix($opAdditY(out,Character.toString($cast(char.class,((char[])characters)[$int(len)])))));
        $line=49;
        len=$cast(Integer.class,$fix($opAdditY(len,1)));
      }
      $line=51;
      $result=out;
      if (true) break $try;
      $line=52;
      $rethrow(new RuntimeException("The function \"cutString(reading:String)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Decoder.class,"cutString",$line);
    }
    return $result;
  }
  public static ITransducer createTransducer(Object A) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=57;
      gold.structures.set.ISet $v5=$newSet();
      $v6:for (Object position:GCollections.unmodifiableCollection(GCollections.asSet(0,1))) {
        gold.structures.set.ISet $v7=$newSet();
        $v8:for (Object p:GCollections.unmodifiableCollection(A)) {
          for (Object q:GCollections.unmodifiableCollection(A)) {
            for (Object r:GCollections.unmodifiableCollection(A)) {
              $v7.add($opAdditY($opAdditY($opAdditY($opAdditY("",p),q),r),"!"));
            }
          }
        }
        for (Object firstSet:GCollections.unmodifiableCollection($opUnionY($v7,GCollections.asSet("Asterisk","Asterisk!",GCollections.emptySet())))) {
          gold.structures.set.ISet $v9=$newSet();
          $v10:for (Object p:GCollections.unmodifiableCollection(A)) {
            $v9.add($opAdditY("",p));
          }
          gold.structures.set.ISet $v11=$newSet();
          $v12:for (Object p:GCollections.unmodifiableCollection(A)) {
            for (Object q:GCollections.unmodifiableCollection(A)) {
              $v11.add($opAdditY($opAdditY("",p),q));
            }
          }
          gold.structures.set.ISet $v13=$newSet();
          $v14:for (Object p:GCollections.unmodifiableCollection(A)) {
            for (Object q:GCollections.unmodifiableCollection(A)) {
              for (Object r:GCollections.unmodifiableCollection(A)) {
                $v13.add($opAdditY($opAdditY($opAdditY("",p),q),r));
              }
            }
          }
          gold.structures.set.ISet $v15=$newSet();
          $v16:for (Object p:GCollections.unmodifiableCollection(A)) {
            for (Object q:GCollections.unmodifiableCollection(A)) {
              for (Object r:GCollections.unmodifiableCollection(A)) {
                $v15.add($opAdditY($opAdditY($opAdditY($opAdditY("",p),q),r),"!"));
              }
            }
          }
          for (Object secondSet:GCollections.unmodifiableCollection($opUnionY($opUnionY($opUnionY($opUnionY($v9,$v11),$v13),$v15),GCollections.asSet("Asterisk","Asterisk!")))) {
            $v5.add(GCollections.asList(position,firstSet,secondSet));
          }
        }
      }
      Object States=$fix($opUnionY(GCollections.asSet("Start","Final","Error"),$v5));
      $line=61;
      Object InAlphabet=$fix(GCollections.asSet('a','b','c','d','!','#','*'));
      $line=62;
      Object OutAlphabet=$fix(GCollections.asSet('a','b','c','d','!','#'));
      $line=63;
      Object initState=$fix("Start");
      $line=64;
      Object finalStates=$fix(GCollections.asSet("Final"));
      $line=66;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{States,InAlphabet,OutAlphabet,initState,finalStates,new GMethod(Decoder.class,"\u03B41"),new GMethod(Decoder.class,"h1"),new GMethod(Decoder.class,"g")});
      if (true) break $try;
      $line=67;
      $rethrow(new RuntimeException("The function \"createTransducer(A:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Decoder.class,"createTransducer",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object \u03B41(Object q, Object \u03C3) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=71;
      Object A=$fix(GCollections.asSet('a','b','c','d'));
      $line=72;
      if (($opEqualY(q,"Start")&&$opMembrY(\u03C3,A))) {
        $line=73;
        $result=GCollections.asList(1,GCollections.emptySet(),Character.toString($cast(char.class,\u03C3)));
        if (true) break $try;
      }
      else {
        $line=74;
        if (($opEqualY(q,"Start")&&$opEqualY(Character.toString($cast(char.class,\u03C3)),"#"))) {
          $line=75;
          $result="Final";
          if (true) break $try;
        }
        else {
          $line=77;
          $result="Error";
          if (true) break $try;
        }
      }
      $line=80;
      $rethrow(new RuntimeException("The function \"\u03B41(q:Object,\u03C3:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Decoder.class,"\u03B41",$line);
    }
    return $result;
  }
  public static Object \u03B41(java.lang.Iterable $v17, Object reading) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v18=GCollections.unmodifiableCollection($v17).iterator();
      Object position=$v18.next();
      Object firstSet=$v18.next();
      Object secondSet=$v18.next();
      $line=83;
      Object A=$fix(GCollections.asSet('a','b','c','d'));
      $line=85;
      if (($opEqualY($opAbsolY(secondSet),1)&&$opMembrY(reading,A))) {
        $line=86;
        $result=GCollections.asList(position,firstSet,$opAdditY(secondSet,reading));
        if (true) break $try;
      }
      else {
        $line=89;
        if (($opEqualY($opAbsolY(secondSet),2)&&$opMembrY(reading,A))) {
          $line=90;
          $result=GCollections.asList(position,firstSet,$opAdditY(secondSet,reading));
          if (true) break $try;
        }
        else {
          $line=92;
          if (($opEqualY($opAbsolY(secondSet),3)&&$opEqualY(reading,'!'))) {
            $line=94;
            if (($opEqualY(position,0)&&$opEqualY(firstSet,$opAdditY(secondSet,reading)))) {
              $line=95;
              $result="Error";
              if (true) break $try;
            }
            else {
              $line=97;
              $result=GCollections.asList(position,firstSet,$opAdditY(secondSet,reading));
              if (true) break $try;
            }
          }
          else {
            $line=100;
            if ((($opEqualY($opAbsolY(secondSet),3)&&$opEqualY(reading,'#'))&&!$opEqualY(position,1))) {
              $line=101;
              if (($opEqualY(position,0)&&$opEqualY(firstSet,$opAdditY(secondSet,"!")))) {
                $line=102;
                $result="Error";
                if (true) break $try;
              }
              else {
                $line=104;
                $result="Final";
                if (true) break $try;
              }
            }
            else {
              $line=107;
              if (($opEqualY($opAbsolY(secondSet),4)&&$opMembrY(reading,A))) {
                $line=108;
                $result=GCollections.asList($opModulY($opAdditY(position,1),2),secondSet,Character.toString($cast(char.class,reading)));
                if (true) break $try;
              }
              else {
                $line=109;
                if ((($opEqualY($opAbsolY(secondSet),4)&&$opEqualY(reading,'*'))&&!$opEqualY(position,0))) {
                  $line=110;
                  $result=GCollections.asList($opModulY($opAdditY(position,1),2),secondSet,"Asterisk");
                  if (true) break $try;
                }
                else {
                  $line=111;
                  if (($opEqualY(secondSet,"Asterisk")&&$opEqualY(reading,'!'))) {
                    $line=112;
                    $result=GCollections.asList(position,firstSet,"Asterisk!");
                    if (true) break $try;
                  }
                  else {
                    $line=113;
                    if ((($opEqualY(secondSet,"Asterisk")&&$opEqualY(reading,'#'))&&!$opEqualY(position,1))) {
                      $line=114;
                      $result="Final";
                      if (true) break $try;
                    }
                    else {
                      $line=115;
                      if (($opEqualY(secondSet,"Asterisk!")&&$opMembrY(reading,A))) {
                        $line=116;
                        $result=GCollections.asList($opModulY($opAdditY(position,1),2),secondSet,Character.toString($cast(char.class,reading)));
                        if (true) break $try;
                      }
                      else {
                        $line=118;
                        $result="Error";
                        if (true) break $try;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      $line=120;
      $rethrow(new RuntimeException("The function \"\u03B41(\u27E8position,firstSet,secondSet\u27E9:java.lang.Iterable,reading:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Decoder.class,"\u03B41",$line);
    }
    return $result;
  }
  public static Object h1(Object state) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=124;
      $result="";
      if (true) break $try;
      $line=125;
      $rethrow(new RuntimeException("The function \"h1(state:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Decoder.class,"h1",$line);
    }
    return $result;
  }
  public static Object h1(java.lang.Iterable $v19) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v20=GCollections.unmodifiableCollection($v19).iterator();
      Object position=$v20.next();
      Object firstSet=$v20.next();
      Object secondSet=$v20.next();
      $line=128;
      $result="";
      if (true) break $try;
      $line=129;
      $rethrow(new RuntimeException("The function \"h1(\u27E8position,firstSet,secondSet\u27E9:java.lang.Iterable)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Decoder.class,"h1",$line);
    }
    return $result;
  }
  public static Object g(Object state, Object reading) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=132;
      if (($opEqualY(state,"Start")&&$opEqualY(Character.toString($cast(char.class,reading)),"#"))) {
        $line=133;
        $result=reading;
        if (true) break $try;
      }
      else {
        $line=135;
        $result="";
        if (true) break $try;
      }
      $line=137;
      $rethrow(new RuntimeException("The function \"g(state:Object,reading:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Decoder.class,"g",$line);
    }
    return $result;
  }
  public static Object g(java.lang.Iterable $v21, Object reading) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v22=GCollections.unmodifiableCollection($v21).iterator();
      Object position=$v22.next();
      Object firstSet=$v22.next();
      Object secondSet=$v22.next();
      $line=140;
      Object A=$fix(GCollections.asSet('a','b','c','d'));
      $line=141;
      if (($opEqualY($opAbsolY(secondSet),2)&&$opMembrY(reading,A))) {
        $line=142;
        $result=$opAdditY(secondSet,reading);
        if (true) break $try;
      }
      else {
        $line=143;
        if (($opEqualY($opAbsolY(secondSet),3)&&$opEqualY(reading,'!'))) {
          $line=144;
          $result=reading;
          if (true) break $try;
        }
        else {
          $line=145;
          if (($opEqualY($opAbsolY(secondSet),3)&&$opEqualY(reading,'#'))) {
            $line=146;
            $result=reading;
            if (true) break $try;
          }
          else {
            $line=147;
            if (($opEqualY($opAbsolY(secondSet),4)&&$opEqualY(reading,'*'))) {
              $line=148;
              $result=Decoder.cutString($cast(java.lang.String.class,secondSet));
              if (true) break $try;
            }
            else {
              $line=149;
              if (($opEqualY(secondSet,"Asterisk")&&$opEqualY(reading,'!'))) {
                $line=150;
                $result=reading;
                if (true) break $try;
              }
              else {
                $line=151;
                if (($opEqualY(secondSet,"Asterisk")&&$opEqualY(reading,'#'))) {
                  $line=152;
                  $result=reading;
                  if (true) break $try;
                }
                else {
                  $line=154;
                  $result="";
                  if (true) break $try;
                }
              }
            }
          }
        }
      }
      $line=156;
      $rethrow(new RuntimeException("The function \"g(\u27E8position,firstSet,secondSet\u27E9:java.lang.Iterable,reading:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Decoder.class,"g",$line);
    }
    return $result;
  }
}
