// Generated from Ip.g4 by ANTLR 4.7.2
package pers.pudge.spark.practices.officialApi.a.antlr4.ip;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IP=1, INT=2, STRING=3, DATE=4, NL=5, IGNORE1=6, IGNORE2=7;
	public static final int
		RULE_prog = 0, RULE_row = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "row"
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

	@Override
	public String getGrammarFileName() { return "Ip.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FindOneRowContext extends ProgContext {
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public FindOneRowContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IpListener ) ((IpListener)listener).enterFindOneRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IpListener ) ((IpListener)listener).exitFindOneRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IpVisitor ) return ((IpVisitor<? extends T>)visitor).visitFindOneRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			_localctx = new FindOneRowContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(5); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4);
				row();
				}
				}
				setState(7); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IP) | (1L << INT) | (1L << STRING) | (1L << DATE) | (1L << NL))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowContext extends ParserRuleContext {
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
	 
		public RowContext() { }
		public void copyFrom(RowContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DateContext extends RowContext {
		public TerminalNode DATE() { return getToken(IpParser.DATE, 0); }
		public DateContext(RowContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IpListener ) ((IpListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IpListener ) ((IpListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IpVisitor ) return ((IpVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SendDataContext extends RowContext {
		public TerminalNode INT() { return getToken(IpParser.INT, 0); }
		public SendDataContext(RowContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IpListener ) ((IpListener)listener).enterSendData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IpListener ) ((IpListener)listener).exitSendData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IpVisitor ) return ((IpVisitor<? extends T>)visitor).visitSendData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IpContext extends RowContext {
		public TerminalNode IP() { return getToken(IpParser.IP, 0); }
		public IpContext(RowContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IpListener ) ((IpListener)listener).enterIp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IpListener ) ((IpListener)listener).exitIp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IpVisitor ) return ((IpVisitor<? extends T>)visitor).visitIp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EndContext extends RowContext {
		public TerminalNode NL() { return getToken(IpParser.NL, 0); }
		public EndContext(RowContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IpListener ) ((IpListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IpListener ) ((IpListener)listener).exitEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IpVisitor ) return ((IpVisitor<? extends T>)visitor).visitEnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ApiContext extends RowContext {
		public TerminalNode STRING() { return getToken(IpParser.STRING, 0); }
		public ApiContext(RowContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IpListener ) ((IpListener)listener).enterApi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IpListener ) ((IpListener)listener).exitApi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IpVisitor ) return ((IpVisitor<? extends T>)visitor).visitApi(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RespCodeContext extends RowContext {
		public TerminalNode INT() { return getToken(IpParser.INT, 0); }
		public RespCodeContext(RowContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IpListener ) ((IpListener)listener).enterRespCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IpListener ) ((IpListener)listener).exitRespCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IpVisitor ) return ((IpVisitor<? extends T>)visitor).visitRespCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_row);
		try {
			setState(15);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new DateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(9);
				match(DATE);
				}
				break;
			case 2:
				_localctx = new IpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(10);
				match(IP);
				}
				break;
			case 3:
				_localctx = new ApiContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(11);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new RespCodeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(12);
				match(INT);
				}
				break;
			case 5:
				_localctx = new SendDataContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(13);
				match(INT);
				}
				break;
			case 6:
				_localctx = new EndContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(14);
				match(NL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t\24\4\2\t\2\4\3"+
		"\t\3\3\2\6\2\b\n\2\r\2\16\2\t\3\3\3\3\3\3\3\3\3\3\3\3\5\3\22\n\3\3\3\2"+
		"\2\4\2\4\2\2\2\27\2\7\3\2\2\2\4\21\3\2\2\2\6\b\5\4\3\2\7\6\3\2\2\2\b\t"+
		"\3\2\2\2\t\7\3\2\2\2\t\n\3\2\2\2\n\3\3\2\2\2\13\22\7\6\2\2\f\22\7\3\2"+
		"\2\r\22\7\5\2\2\16\22\7\4\2\2\17\22\7\4\2\2\20\22\7\7\2\2\21\13\3\2\2"+
		"\2\21\f\3\2\2\2\21\r\3\2\2\2\21\16\3\2\2\2\21\17\3\2\2\2\21\20\3\2\2\2"+
		"\22\5\3\2\2\2\4\t\21";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}