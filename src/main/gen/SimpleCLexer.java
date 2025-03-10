// Generated from /home/phoenix/gcc/src/main/antlr/SimpleC.g4 by ANTLR 4.13.2

    package antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SimpleCLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, IDENTIFIER=19, INTEGER=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "IDENTIFIER", "INTEGER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'['", "']'", "'void'", "'int'", "'unsigned int'", 
			"'{'", "'}'", "'return'", "';'", "'*'", "'/'", "'+'", "'-'", "'<'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "IDENTIFIER", "INTEGER", "WS"
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


	public SimpleCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleC.g4"; }

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
		"\u0004\u0000\u0015\u007f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0004\u0012"+
		"f\b\u0012\u000b\u0012\f\u0012g\u0001\u0012\u0005\u0012k\b\u0012\n\u0012"+
		"\f\u0012n\t\u0012\u0001\u0013\u0003\u0013q\b\u0013\u0001\u0013\u0004\u0013"+
		"t\b\u0013\u000b\u0013\f\u0013u\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014|\b\u0014\u0001\u0014\u0001\u0014\u0000\u0000\u0015"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015\u0001\u0000"+
		"\u0004\u0002\u0000AZaz\u0003\u000009AZaz\u0001\u000009\u0002\u0000\t\t"+
		"  \u0084\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0001+\u0001\u0000\u0000\u0000\u0003-\u0001\u0000\u0000\u0000"+
		"\u0005/\u0001\u0000\u0000\u0000\u00071\u0001\u0000\u0000\u0000\t3\u0001"+
		"\u0000\u0000\u0000\u000b5\u0001\u0000\u0000\u0000\r:\u0001\u0000\u0000"+
		"\u0000\u000f>\u0001\u0000\u0000\u0000\u0011K\u0001\u0000\u0000\u0000\u0013"+
		"M\u0001\u0000\u0000\u0000\u0015O\u0001\u0000\u0000\u0000\u0017V\u0001"+
		"\u0000\u0000\u0000\u0019X\u0001\u0000\u0000\u0000\u001bZ\u0001\u0000\u0000"+
		"\u0000\u001d\\\u0001\u0000\u0000\u0000\u001f^\u0001\u0000\u0000\u0000"+
		"!`\u0001\u0000\u0000\u0000#b\u0001\u0000\u0000\u0000%e\u0001\u0000\u0000"+
		"\u0000\'p\u0001\u0000\u0000\u0000){\u0001\u0000\u0000\u0000+,\u0005(\u0000"+
		"\u0000,\u0002\u0001\u0000\u0000\u0000-.\u0005,\u0000\u0000.\u0004\u0001"+
		"\u0000\u0000\u0000/0\u0005)\u0000\u00000\u0006\u0001\u0000\u0000\u0000"+
		"12\u0005[\u0000\u00002\b\u0001\u0000\u0000\u000034\u0005]\u0000\u0000"+
		"4\n\u0001\u0000\u0000\u000056\u0005v\u0000\u000067\u0005o\u0000\u0000"+
		"78\u0005i\u0000\u000089\u0005d\u0000\u00009\f\u0001\u0000\u0000\u0000"+
		":;\u0005i\u0000\u0000;<\u0005n\u0000\u0000<=\u0005t\u0000\u0000=\u000e"+
		"\u0001\u0000\u0000\u0000>?\u0005u\u0000\u0000?@\u0005n\u0000\u0000@A\u0005"+
		"s\u0000\u0000AB\u0005i\u0000\u0000BC\u0005g\u0000\u0000CD\u0005n\u0000"+
		"\u0000DE\u0005e\u0000\u0000EF\u0005d\u0000\u0000FG\u0005 \u0000\u0000"+
		"GH\u0005i\u0000\u0000HI\u0005n\u0000\u0000IJ\u0005t\u0000\u0000J\u0010"+
		"\u0001\u0000\u0000\u0000KL\u0005{\u0000\u0000L\u0012\u0001\u0000\u0000"+
		"\u0000MN\u0005}\u0000\u0000N\u0014\u0001\u0000\u0000\u0000OP\u0005r\u0000"+
		"\u0000PQ\u0005e\u0000\u0000QR\u0005t\u0000\u0000RS\u0005u\u0000\u0000"+
		"ST\u0005r\u0000\u0000TU\u0005n\u0000\u0000U\u0016\u0001\u0000\u0000\u0000"+
		"VW\u0005;\u0000\u0000W\u0018\u0001\u0000\u0000\u0000XY\u0005*\u0000\u0000"+
		"Y\u001a\u0001\u0000\u0000\u0000Z[\u0005/\u0000\u0000[\u001c\u0001\u0000"+
		"\u0000\u0000\\]\u0005+\u0000\u0000]\u001e\u0001\u0000\u0000\u0000^_\u0005"+
		"-\u0000\u0000_ \u0001\u0000\u0000\u0000`a\u0005<\u0000\u0000a\"\u0001"+
		"\u0000\u0000\u0000bc\u0005>\u0000\u0000c$\u0001\u0000\u0000\u0000df\u0007"+
		"\u0000\u0000\u0000ed\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hl\u0001\u0000\u0000"+
		"\u0000ik\u0007\u0001\u0000\u0000ji\u0001\u0000\u0000\u0000kn\u0001\u0000"+
		"\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000m&\u0001"+
		"\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000oq\u0005-\u0000\u0000po\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000\u0000"+
		"rt\u0007\u0002\u0000\u0000sr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v(\u0001\u0000"+
		"\u0000\u0000w|\u0007\u0003\u0000\u0000xy\u0005\r\u0000\u0000y|\u0005\n"+
		"\u0000\u0000z|\u0005\n\u0000\u0000{w\u0001\u0000\u0000\u0000{x\u0001\u0000"+
		"\u0000\u0000{z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0006"+
		"\u0014\u0000\u0000~*\u0001\u0000\u0000\u0000\u0006\u0000glpu{\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}