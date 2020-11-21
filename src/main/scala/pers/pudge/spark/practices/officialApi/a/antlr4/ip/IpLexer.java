// Generated from Ip.g4 by ANTLR 4.7.2
package pers.pudge.spark.practices.officialApi.a.antlr4.ip;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IpLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IP=1, INT=2, STRING=3, DATE=4, NL=5, IGNORE1=6, IGNORE2=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IP", "INT", "STRING", "DATE", "NL", "IGNORE1", "IGNORE2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'\n'", "' '", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IP", "INT", "STRING", "DATE", "NL", "IGNORE1", "IGNORE2"
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


	public IpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Ip.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t:\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\6\3\33\n\3\r\3\16\3\34\3\4\3\4\7\4!\n\4\f\4\16\4$\13\4\3"+
		"\4\3\4\3\5\3\5\7\5*\n\5\f\5\16\5-\13\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\4\"+\2\t\3\3\5\4\7\5\t\6\13\7\r\b\17\t\3\2\3\3\2\62;"+
		"\2<\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3"+
		"\2\2\2\2\17\3\2\2\2\3\21\3\2\2\2\5\32\3\2\2\2\7\36\3\2\2\2\t\'\3\2\2\2"+
		"\13\60\3\2\2\2\r\62\3\2\2\2\17\66\3\2\2\2\21\22\5\5\3\2\22\23\7\60\2\2"+
		"\23\24\5\5\3\2\24\25\7\60\2\2\25\26\5\5\3\2\26\27\7\60\2\2\27\30\5\5\3"+
		"\2\30\4\3\2\2\2\31\33\t\2\2\2\32\31\3\2\2\2\33\34\3\2\2\2\34\32\3\2\2"+
		"\2\34\35\3\2\2\2\35\6\3\2\2\2\36\"\7$\2\2\37!\13\2\2\2 \37\3\2\2\2!$\3"+
		"\2\2\2\"#\3\2\2\2\" \3\2\2\2#%\3\2\2\2$\"\3\2\2\2%&\7$\2\2&\b\3\2\2\2"+
		"\'+\7]\2\2(*\13\2\2\2)(\3\2\2\2*-\3\2\2\2+,\3\2\2\2+)\3\2\2\2,.\3\2\2"+
		"\2-+\3\2\2\2./\7_\2\2/\n\3\2\2\2\60\61\7\f\2\2\61\f\3\2\2\2\62\63\7\""+
		"\2\2\63\64\3\2\2\2\64\65\b\7\2\2\65\16\3\2\2\2\66\67\7/\2\2\678\3\2\2"+
		"\289\b\b\2\29\20\3\2\2\2\6\2\34\"+\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}