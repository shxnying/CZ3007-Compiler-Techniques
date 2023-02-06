/* The following code was generated by JFlex 1.4 on 6/2/23, 1:47 pm */

/* You do not need to change anything up here. */
package lexer;

import frontend.Token;
import static frontend.Token.Type.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4
 * on 6/2/23, 1:47 pm from the specification file
 * <tt>C:/Users/shan ying/Downloads/lab1/lab1/Lab1/src/frontend/lexer.flex</tt>
 */
public final class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\2\1\0\1\1\1\1\22\0\1\1\1\45\1\53"+
    "\5\0\1\33\1\36\1\47\1\46\1\30\1\44\1\0\1\40\12\52"+
    "\1\0\1\37\1\43\1\41\1\42\2\0\32\50\1\31\1\0\1\34"+
    "\1\0\1\51\1\0\1\7\1\3\1\23\1\21\1\6\1\14\1\50"+
    "\1\27\1\15\1\50\1\12\1\5\1\16\1\10\1\4\1\17\1\50"+
    "\1\11\1\13\1\20\1\22\1\25\1\26\1\50\1\24\1\50\1\32"+
    "\1\0\1\35\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\13\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\1\1\21\1\22\1\23\1\1\6\3\1\24"+
    "\7\3\1\25\1\26\1\27\1\30\1\0\1\31\5\3"+
    "\1\32\11\3\1\33\5\3\1\34\1\35\1\36\2\3"+
    "\1\37\1\3\1\40\3\3\1\41\1\3\1\42\1\43"+
    "\1\44\1\45\1\46";

  private static int [] zzUnpackAction() {
    int [] result = new int[91];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\54\0\54\0\130\0\204\0\260\0\334\0\u0108"+
    "\0\u0134\0\u0160\0\u018c\0\u01b8\0\u01e4\0\u0210\0\54\0\54"+
    "\0\54\0\54\0\54\0\54\0\54\0\54\0\54\0\u023c"+
    "\0\u0268\0\u0294\0\54\0\u02c0\0\54\0\54\0\u02ec\0\u0318"+
    "\0\u0344\0\u0370\0\u039c\0\u03c8\0\u03f4\0\u0420\0\204\0\u044c"+
    "\0\u0478\0\u04a4\0\u04d0\0\u04fc\0\u0528\0\u0554\0\54\0\54"+
    "\0\54\0\54\0\u0318\0\54\0\u0580\0\u05ac\0\u05d8\0\u0604"+
    "\0\u0630\0\204\0\u065c\0\u0688\0\u06b4\0\u06e0\0\u070c\0\u0738"+
    "\0\u0764\0\u0790\0\u07bc\0\204\0\u07e8\0\u0814\0\u0840\0\u086c"+
    "\0\u0898\0\204\0\204\0\204\0\u08c4\0\u08f0\0\204\0\u091c"+
    "\0\204\0\u0948\0\u0974\0\u09a0\0\204\0\u09cc\0\204\0\204"+
    "\0\204\0\204\0\204";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[91];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\2\5\1\6\2\5\1\7\2\5"+
    "\1\10\1\11\1\12\1\13\1\14\4\5\1\15\1\16"+
    "\1\5\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\5\1\2\1\37\1\40\57\0\1\5\1\41"+
    "\4\5\1\42\16\5\20\0\3\5\4\0\25\5\20\0"+
    "\3\5\4\0\2\5\1\43\22\5\20\0\3\5\4\0"+
    "\3\5\1\44\21\5\20\0\3\5\4\0\4\5\1\45"+
    "\20\5\20\0\3\5\4\0\5\5\1\46\3\5\1\47"+
    "\1\5\1\50\11\5\20\0\3\5\4\0\1\5\1\51"+
    "\23\5\20\0\3\5\4\0\17\5\1\52\5\5\20\0"+
    "\3\5\4\0\6\5\1\53\12\5\1\54\3\5\20\0"+
    "\3\5\4\0\1\5\1\55\23\5\20\0\3\5\4\0"+
    "\24\5\1\56\20\0\3\5\42\0\1\57\53\0\1\60"+
    "\53\0\1\61\53\0\1\62\64\0\1\37\1\0\2\63"+
    "\1\0\50\63\1\64\3\0\1\5\1\65\23\5\20\0"+
    "\3\5\4\0\3\5\1\66\21\5\20\0\3\5\4\0"+
    "\10\5\1\67\14\5\20\0\3\5\4\0\15\5\1\70"+
    "\7\5\20\0\3\5\4\0\2\5\1\71\22\5\20\0"+
    "\3\5\4\0\15\5\1\72\7\5\20\0\3\5\4\0"+
    "\14\5\1\73\10\5\20\0\3\5\4\0\16\5\1\74"+
    "\6\5\20\0\3\5\4\0\1\75\24\5\20\0\3\5"+
    "\4\0\17\5\1\76\5\5\20\0\3\5\4\0\14\5"+
    "\1\77\10\5\20\0\3\5\4\0\12\5\1\100\12\5"+
    "\20\0\3\5\4\0\12\5\1\101\12\5\20\0\3\5"+
    "\4\0\2\5\1\102\22\5\20\0\3\5\4\0\4\5"+
    "\1\103\20\5\20\0\3\5\4\0\3\5\1\104\21\5"+
    "\20\0\3\5\4\0\17\5\1\105\5\5\20\0\3\5"+
    "\4\0\10\5\1\106\14\5\20\0\3\5\4\0\1\5"+
    "\1\107\23\5\20\0\3\5\4\0\17\5\1\110\5\5"+
    "\20\0\3\5\4\0\2\5\1\111\22\5\20\0\3\5"+
    "\4\0\3\5\1\112\21\5\20\0\3\5\4\0\3\5"+
    "\1\113\21\5\20\0\3\5\4\0\16\5\1\114\6\5"+
    "\20\0\3\5\4\0\2\5\1\115\22\5\20\0\3\5"+
    "\4\0\3\5\1\116\21\5\20\0\3\5\4\0\7\5"+
    "\1\117\15\5\20\0\3\5\4\0\6\5\1\120\16\5"+
    "\20\0\3\5\4\0\3\5\1\121\21\5\20\0\3\5"+
    "\4\0\6\5\1\122\16\5\20\0\3\5\4\0\2\5"+
    "\1\123\22\5\20\0\3\5\4\0\12\5\1\124\12\5"+
    "\20\0\3\5\4\0\3\5\1\125\21\5\20\0\3\5"+
    "\4\0\4\5\1\126\20\5\20\0\3\5\4\0\5\5"+
    "\1\127\17\5\20\0\3\5\4\0\15\5\1\130\7\5"+
    "\20\0\3\5\4\0\3\5\1\131\21\5\20\0\3\5"+
    "\4\0\20\5\1\132\4\5\20\0\3\5\4\0\5\5"+
    "\1\133\17\5\20\0\3\5\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2552];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\13\1\11\11\3\1\1\11\1\1\2\11"+
    "\20\1\4\11\1\0\1\11\47\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[91];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /* user code: */
	/* These two methods are for the convenience of rules to create token objects.
	* If you do not want to use them, delete them
	* otherwise add the code in
	*/

	private Token token(Token.Type type) {
		return token(type, yytext());
	}

	/* Use this method for rules where you need to process yytext() to get the lexeme of the token.
	 *
	 * Useful for string literals; e.g., the quotes around the literal are part of yytext(),
	 *       but they should not be part of the lexeme.
	*/
	private Token token(Token.Type type, String text) {
		return new Token(type, yyline, yycolumn, text);
	}


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 126) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzPushbackPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead < 0) {
      return true;
    }
    else {
      zzEndRead+= numRead;
      return false;
    }
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token nextToken() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = zzLexicalState;


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 28: 
          { return token(TRUE);
          }
        case 39: break;
        case 29: 
          { return token(TYPE);
          }
        case 40: break;
        case 20: 
          { return token(IF);
          }
        case 41: break;
        case 30: 
          { return token(VOID);
          }
        case 42: break;
        case 27: 
          { return token(ELSE);
          }
        case 43: break;
        case 18: 
          { return token(TIMES);
          }
        case 44: break;
        case 38: 
          { return token(BOOLEAN);
          }
        case 45: break;
        case 36: 
          { return token(MODULE);
          }
        case 46: break;
        case 25: 
          { return token(STRING_LITERAL, yytext().substring(1, yytext().length() - 1));
          }
        case 47: break;
        case 33: 
          { return token(WHILE);
          }
        case 48: break;
        case 31: 
          { return token(BREAK);
          }
        case 49: break;
        case 34: 
          { return token(RETURN);
          }
        case 50: break;
        case 19: 
          { return token(INT_LITERAL);
          }
        case 51: break;
        case 3: 
          { return token(ID);
          }
        case 52: break;
        case 1: 
          { throw new Error("unexpected character '" + yytext() + "'");
          }
        case 53: break;
        case 6: 
          { return token(LCURLY);
          }
        case 54: break;
        case 23: 
          { return token(LEQ);
          }
        case 55: break;
        case 16: 
          { return token(MINUS);
          }
        case 56: break;
        case 35: 
          { return token(IMPORT);
          }
        case 57: break;
        case 7: 
          { return token(LPAREN);
          }
        case 58: break;
        case 5: 
          { return token(LBRACKET);
          }
        case 59: break;
        case 11: 
          { return token(SEMICOLON);
          }
        case 60: break;
        case 26: 
          { return token(INT);
          }
        case 61: break;
        case 4: 
          { return token(COMMA);
          }
        case 62: break;
        case 21: 
          { return token(EQEQ);
          }
        case 63: break;
        case 12: 
          { return token(DIV);
          }
        case 64: break;
        case 32: 
          { return token(FALSE);
          }
        case 65: break;
        case 14: 
          { return token(GT);
          }
        case 66: break;
        case 15: 
          { return token(LT);
          }
        case 67: break;
        case 22: 
          { return token(GEQ);
          }
        case 68: break;
        case 8: 
          { return token(RBRACKET);
          }
        case 69: break;
        case 13: 
          { return token(EQL);
          }
        case 70: break;
        case 9: 
          { return token(RCURLY);
          }
        case 71: break;
        case 24: 
          { return token(NEQ);
          }
        case 72: break;
        case 37: 
          { return token(PUBLIC);
          }
        case 73: break;
        case 10: 
          { return token(RPAREN);
          }
        case 74: break;
        case 17: 
          { return token(PLUS);
          }
        case 75: break;
        case 2: 
          { 
          }
        case 76: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
              { return token(EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
