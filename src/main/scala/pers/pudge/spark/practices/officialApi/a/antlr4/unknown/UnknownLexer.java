// Generated from Unknown.g4 by ANTLR 4.7.2
package pers.pudge.spark.practices.officialApi.a.antlr4.unknown;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UnknownLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDENTIFIER=1, STRING=2, DATE=3, SIMPLE_COMMENT=4, BRACKETED_EMPTY_COMMENT=5, 
		BRACKETED_COMMENT=6, WS=7, UNRECOGNIZED=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IDENTIFIER", "STRING", "DATE", "SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", 
			"BRACKETED_COMMENT", "WS", "UNRECOGNIZED"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'/**/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IDENTIFIER", "STRING", "DATE", "SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", 
			"BRACKETED_COMMENT", "WS", "UNRECOGNIZED"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public UnknownLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Unknown.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n\u0087\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2"+
		"\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\3\2\3\2\3\2\3\2\7\2\"\n\2\f\2\16"+
		"\2%\13\2\3\2\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\2\7\2\62\n\2\f"+
		"\2\16\2\65\13\2\5\2\67\n\2\3\3\3\3\3\3\3\3\7\3=\n\3\f\3\16\3@\13\3\3\3"+
		"\3\3\3\3\3\3\3\3\7\3G\n\3\f\3\16\3J\13\3\3\3\5\3M\n\3\3\4\3\4\7\4Q\n\4"+
		"\f\4\16\4T\13\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5\\\n\5\f\5\16\5_\13\5\3\5\5"+
		"\5b\n\5\3\5\5\5e\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\7\7u\n\7\f\7\16\7x\13\7\3\7\3\7\3\7\3\7\3\7\3\b\6\b\u0080\n\b\r"+
		"\b\16\b\u0081\3\b\3\b\3\t\3\t\4Rv\2\n\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\3\2\f\3\2$$\3\2bb\3\2__\5\2C\\aac|\6\2\62;C\\aac|\4\2))^^\4\2$$^^\4"+
		"\2\f\f\17\17\3\2--\5\2\13\f\17\17\"\"\2\u009a\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\3\66\3\2\2\2\5L\3\2\2\2\7N\3\2\2\2\tW\3\2\2\2\13h\3\2\2\2\ro\3"+
		"\2\2\2\17\177\3\2\2\2\21\u0085\3\2\2\2\23\31\7$\2\2\24\30\n\2\2\2\25\26"+
		"\7$\2\2\26\30\7$\2\2\27\24\3\2\2\2\27\25\3\2\2\2\30\33\3\2\2\2\31\27\3"+
		"\2\2\2\31\32\3\2\2\2\32\34\3\2\2\2\33\31\3\2\2\2\34\67\7$\2\2\35#\7b\2"+
		"\2\36\"\n\3\2\2\37 \7b\2\2 \"\7b\2\2!\36\3\2\2\2!\37\3\2\2\2\"%\3\2\2"+
		"\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&\67\7b\2\2\'+\7]\2\2(*\n\4"+
		"\2\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2.\67\7"+
		"_\2\2/\63\t\5\2\2\60\62\t\6\2\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2"+
		"\2\2\63\64\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\66\23\3\2\2\2\66\35\3\2"+
		"\2\2\66\'\3\2\2\2\66/\3\2\2\2\67\4\3\2\2\28>\7)\2\29=\n\7\2\2:;\7^\2\2"+
		";=\13\2\2\2<9\3\2\2\2<:\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2"+
		"\2@>\3\2\2\2AM\7)\2\2BH\7$\2\2CG\n\b\2\2DE\7^\2\2EG\13\2\2\2FC\3\2\2\2"+
		"FD\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KM\7$\2\2"+
		"L8\3\2\2\2LB\3\2\2\2M\6\3\2\2\2NR\7]\2\2OQ\13\2\2\2PO\3\2\2\2QT\3\2\2"+
		"\2RS\3\2\2\2RP\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7_\2\2V\b\3\2\2\2WX\7/\2"+
		"\2XY\7/\2\2Y]\3\2\2\2Z\\\n\t\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2"+
		"\2\2^a\3\2\2\2_]\3\2\2\2`b\7\17\2\2a`\3\2\2\2ab\3\2\2\2bd\3\2\2\2ce\7"+
		"\f\2\2dc\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\b\5\2\2g\n\3\2\2\2hi\7\61\2\2i"+
		"j\7,\2\2jk\7,\2\2kl\7\61\2\2lm\3\2\2\2mn\b\6\2\2n\f\3\2\2\2op\7\61\2\2"+
		"pq\7,\2\2qr\3\2\2\2rv\n\n\2\2su\13\2\2\2ts\3\2\2\2ux\3\2\2\2vw\3\2\2\2"+
		"vt\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7,\2\2z{\7\61\2\2{|\3\2\2\2|}\b\7\2\2"+
		"}\16\3\2\2\2~\u0080\t\13\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\b\b\2\2\u0084"+
		"\20\3\2\2\2\u0085\u0086\13\2\2\2\u0086\22\3\2\2\2\25\2\27\31!#+\63\66"+
		"<>FHLR]adv\u0081\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}