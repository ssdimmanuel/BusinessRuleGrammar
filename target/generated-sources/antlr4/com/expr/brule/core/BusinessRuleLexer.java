// Generated from BusinessRule.g4 by ANTLR 4.4

package com.expr.brule.core;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BusinessRuleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, TRUE=2, FALSE=3, STRING=4, QUOTE=5, LEFTPAREN=6, RIGHTPAREN=7, 
		EQUAL=8, LT=9, GT=10, LTE=11, GTE=12, NE=13, AND=14, OR=15, VARIABLE=16, 
		NUMBER=17, SPACE=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'"
	};
	public static final String[] ruleNames = {
		"T__0", "TRUE", "FALSE", "STRING", "QUOTE", "LEFTPAREN", "RIGHTPAREN", 
		"EQUAL", "LT", "GT", "LTE", "GTE", "NE", "AND", "OR", "VARIABLE", "NUMBER", 
		"SPACE"
	};


	public BusinessRuleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BusinessRule.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24\u009b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\5\3\5\7\5B\n\5\f\5\16"+
		"\5E\13\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\5\tR\n\t\3\n\3\n"+
		"\3\n\5\nW\n\n\3\13\3\13\3\13\5\13\\\n\13\3\f\3\f\3\f\3\f\5\fb\n\f\3\r"+
		"\3\r\3\r\3\r\5\rh\n\r\3\16\3\16\3\16\3\16\5\16n\n\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17w\n\17\3\20\3\20\3\20\3\20\3\20\5\20~\n\20\3\21"+
		"\6\21\u0081\n\21\r\21\16\21\u0082\3\21\7\21\u0086\n\21\f\21\16\21\u0089"+
		"\13\21\3\22\6\22\u008c\n\22\r\22\16\22\u008d\3\22\3\22\6\22\u0092\n\22"+
		"\r\22\16\22\u0093\5\22\u0096\n\22\3\23\3\23\3\23\3\23\2\2\24\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\3\2\7\5\2\13\f\17\17$$\4\2C\\c|\7\2/\60\62;C\\aac|\3\2\62;\5"+
		"\2\13\f\17\17\"\"\u00ac\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5\61\3\2\2\2\7=\3\2"+
		"\2\2\t?\3\2\2\2\13H\3\2\2\2\rJ\3\2\2\2\17L\3\2\2\2\21Q\3\2\2\2\23V\3\2"+
		"\2\2\25[\3\2\2\2\27a\3\2\2\2\31g\3\2\2\2\33m\3\2\2\2\35v\3\2\2\2\37}\3"+
		"\2\2\2!\u0080\3\2\2\2#\u008b\3\2\2\2%\u0097\3\2\2\2\'(\7.\2\2(\4\3\2\2"+
		"\2)*\7v\2\2*+\7t\2\2+,\7w\2\2,\62\7g\2\2-.\7V\2\2./\7T\2\2/\60\7W\2\2"+
		"\60\62\7G\2\2\61)\3\2\2\2\61-\3\2\2\2\62\6\3\2\2\2\63\64\7h\2\2\64\65"+
		"\7c\2\2\65\66\7n\2\2\66\67\7u\2\2\67>\7g\2\289\7H\2\29:\7C\2\2:;\7N\2"+
		"\2;<\7U\2\2<>\7G\2\2=\63\3\2\2\2=8\3\2\2\2>\b\3\2\2\2?C\5\13\6\2@B\n\2"+
		"\2\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\5\13"+
		"\6\2G\n\3\2\2\2HI\7$\2\2I\f\3\2\2\2JK\7*\2\2K\16\3\2\2\2LM\7+\2\2M\20"+
		"\3\2\2\2NR\7?\2\2OP\7G\2\2PR\7S\2\2QN\3\2\2\2QO\3\2\2\2R\22\3\2\2\2SW"+
		"\7>\2\2TU\7N\2\2UW\7V\2\2VS\3\2\2\2VT\3\2\2\2W\24\3\2\2\2X\\\7@\2\2YZ"+
		"\7I\2\2Z\\\7V\2\2[X\3\2\2\2[Y\3\2\2\2\\\26\3\2\2\2]^\7>\2\2^b\7?\2\2_"+
		"`\7N\2\2`b\7G\2\2a]\3\2\2\2a_\3\2\2\2b\30\3\2\2\2cd\7@\2\2dh\7?\2\2ef"+
		"\7I\2\2fh\7G\2\2gc\3\2\2\2ge\3\2\2\2h\32\3\2\2\2ij\7#\2\2jn\7?\2\2kl\7"+
		"P\2\2ln\7G\2\2mi\3\2\2\2mk\3\2\2\2n\34\3\2\2\2op\7C\2\2pq\7P\2\2qw\7F"+
		"\2\2rw\7(\2\2st\7c\2\2tu\7p\2\2uw\7f\2\2vo\3\2\2\2vr\3\2\2\2vs\3\2\2\2"+
		"w\36\3\2\2\2xy\7Q\2\2y~\7T\2\2z{\7q\2\2{~\7t\2\2|~\7~\2\2}x\3\2\2\2}z"+
		"\3\2\2\2}|\3\2\2\2~ \3\2\2\2\177\u0081\t\3\2\2\u0080\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0087\3\2"+
		"\2\2\u0084\u0086\t\4\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\"\3\2\2\2\u0089\u0087\3\2\2\2"+
		"\u008a\u008c\t\5\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0095\3\2\2\2\u008f\u0091\7\60\2\2"+
		"\u0090\u0092\t\5\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u008f\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096$\3\2\2\2\u0097\u0098\t\6\2\2\u0098\u0099\3\2\2\2"+
		"\u0099\u009a\b\23\2\2\u009a&\3\2\2\2\23\2\61=CQV[agmv}\u0082\u0087\u008d"+
		"\u0093\u0095\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}