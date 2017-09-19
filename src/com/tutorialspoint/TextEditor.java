package com.tutorialspoint;

/**
 * Created by AlfredWang on 2017/9/19.
 */
public class TextEditor {
    private SpellChecker spellChecker;
//    public TextEditor(SpellChecker spellChecker,String strMsg){
//        System.out.println("Inside TextEditor Constructor"+strMsg);
//        this.spellChecker=spellChecker;
//    }

    public void  setSpellChecker(SpellChecker spellChecker){
        System.out.println("Inside TextEditor Constructor");
        this.spellChecker=spellChecker;
    }

    public SpellChecker getSpellChecker(){
        return spellChecker;
    }

    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
