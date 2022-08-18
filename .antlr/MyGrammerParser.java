// Generated from c:\Users\Gerardo\Documents\github\lab-0-compiladores\MyGrammer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, COMMENTS=14, PLUS=15, MINUS=16, 
		STAR=17, SLASH=18, LOWERTHAN=19, EQUALS=20, LOWEREQUAL=21, IFKEY=22, LOOPKEY=23, 
		ELSEKEY=24, THENKEY=25, WHILEKEY=26, CLASSKEY=27, INHERITSKEY=28, FIKEY=29, 
		INKEY=30, LETKEY=31, NEWKEY=32, POOLKEY=33, ISVOIDKEY=34, NOTKEY=35, TYPE=36, 
		ID=37, OBJECT=38, ALPHANUMERIC=39, DIGIT=40, LOWER=41, UPPER=42, INTEGERS=43, 
		LETTERS=44, STRING=45, WHITESPACE=46;
	public static final int
		RULE_program = 0, RULE_classP = 1, RULE_feature = 2, RULE_method = 3, 
		RULE_arguments = 4, RULE_attribute = 5, RULE_formal = 6, RULE_expr = 7, 
		RULE_declaration = 8, RULE_multipleExpr = 9, RULE_expr2 = 10, RULE_methodCall = 11, 
		RULE_overwrite = 12, RULE_attrWrite = 13, RULE_funCall = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classP", "feature", "method", "arguments", "attribute", "formal", 
			"expr", "declaration", "multipleExpr", "expr2", "methodCall", "overwrite", 
			"attrWrite", "funCall"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'('", "')'", "':'", "','", "'<-'", "'true'", 
			"'false'", "'~'", "'@'", "'.'", null, "'+'", "'-'", "'*'", "'/'", "'<'", 
			"'='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "COMMENTS", "PLUS", "MINUS", "STAR", "SLASH", "LOWERTHAN", 
			"EQUALS", "LOWEREQUAL", "IFKEY", "LOOPKEY", "ELSEKEY", "THENKEY", "WHILEKEY", 
			"CLASSKEY", "INHERITSKEY", "FIKEY", "INKEY", "LETKEY", "NEWKEY", "POOLKEY", 
			"ISVOIDKEY", "NOTKEY", "TYPE", "ID", "OBJECT", "ALPHANUMERIC", "DIGIT", 
			"LOWER", "UPPER", "INTEGERS", "LETTERS", "STRING", "WHITESPACE"
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
	public String getGrammarFileName() { return "MyGrammer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyGrammerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ClassPContext meat;
		public Token end;
		public ClassPContext classP() {
			return getRuleContext(ClassPContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			((ProgramContext)_localctx).meat = classP();
			setState(31);
			((ProgramContext)_localctx).end = match(T__0);
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

	public static class ClassPContext extends ParserRuleContext {
		public TerminalNode CLASSKEY() { return getToken(MyGrammerParser.CLASSKEY, 0); }
		public List<TerminalNode> TYPE() { return getTokens(MyGrammerParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(MyGrammerParser.TYPE, i);
		}
		public TerminalNode INHERITSKEY() { return getToken(MyGrammerParser.INHERITSKEY, 0); }
		public List<FeatureContext> feature() {
			return getRuleContexts(FeatureContext.class);
		}
		public FeatureContext feature(int i) {
			return getRuleContext(FeatureContext.class,i);
		}
		public ClassPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classP; }
	}

	public final ClassPContext classP() throws RecognitionException {
		ClassPContext _localctx = new ClassPContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(CLASSKEY);
			setState(34);
			match(TYPE);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITSKEY) {
				{
				setState(35);
				match(INHERITSKEY);
				setState(36);
				match(TYPE);
				}
			}

			setState(39);
			match(T__1);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(40);
				feature();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			match(T__2);
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

	public static class FeatureContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(MyGrammerParser.ID, 0); }
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_feature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			((FeatureContext)_localctx).name = match(ID);
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(49);
				method();
				}
				break;
			case T__5:
				{
				setState(50);
				attribute();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(53);
			match(T__0);
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

	public static class MethodContext extends ParserRuleContext {
		public ArgumentsContext argumentList;
		public Token returnType;
		public ExprContext mainExpr;
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(MyGrammerParser.TYPE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__3);
			setState(56);
			((MethodContext)_localctx).argumentList = arguments();
			setState(57);
			match(T__4);
			setState(58);
			match(T__5);
			setState(59);
			((MethodContext)_localctx).returnType = match(TYPE);
			setState(60);
			match(T__1);
			setState(61);
			((MethodContext)_localctx).mainExpr = expr();
			setState(62);
			match(T__2);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(64);
				formal();
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(65);
					match(T__6);
					setState(66);
					formal();
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

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

	public static class AttributeContext extends ParserRuleContext {
		public Token typeName;
		public TerminalNode TYPE() { return getToken(MyGrammerParser.TYPE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__5);
			setState(75);
			((AttributeContext)_localctx).typeName = match(TYPE);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(76);
				match(T__7);
				setState(77);
				expr();
				}
			}

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

	public static class FormalContext extends ParserRuleContext {
		public Token name;
		public Token typeName;
		public TerminalNode ID() { return getToken(MyGrammerParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(MyGrammerParser.TYPE, 0); }
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			((FormalContext)_localctx).name = match(ID);
			setState(81);
			match(T__5);
			setState(82);
			((FormalContext)_localctx).typeName = match(TYPE);
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

	public static class ExprContext extends ParserRuleContext {
		public OverwriteContext calls;
		public DeclarationContext newDeclaration;
		public MultipleExprContext innerExpr;
		public Expr2Context nextExpr;
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TerminalNode NOTKEY() { return getToken(MyGrammerParser.NOTKEY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode INTEGERS() { return getToken(MyGrammerParser.INTEGERS, 0); }
		public TerminalNode STRING() { return getToken(MyGrammerParser.STRING, 0); }
		public OverwriteContext overwrite() {
			return getRuleContext(OverwriteContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public MultipleExprContext multipleExpr() {
			return getRuleContext(MultipleExprContext.class,0);
		}
		public TerminalNode IFKEY() { return getToken(MyGrammerParser.IFKEY, 0); }
		public TerminalNode THENKEY() { return getToken(MyGrammerParser.THENKEY, 0); }
		public TerminalNode ELSEKEY() { return getToken(MyGrammerParser.ELSEKEY, 0); }
		public TerminalNode FIKEY() { return getToken(MyGrammerParser.FIKEY, 0); }
		public TerminalNode WHILEKEY() { return getToken(MyGrammerParser.WHILEKEY, 0); }
		public TerminalNode LOOPKEY() { return getToken(MyGrammerParser.LOOPKEY, 0); }
		public TerminalNode POOLKEY() { return getToken(MyGrammerParser.POOLKEY, 0); }
		public TerminalNode LETKEY() { return getToken(MyGrammerParser.LETKEY, 0); }
		public List<TerminalNode> ID() { return getTokens(MyGrammerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MyGrammerParser.ID, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(MyGrammerParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(MyGrammerParser.TYPE, i);
		}
		public TerminalNode INKEY() { return getToken(MyGrammerParser.INKEY, 0); }
		public TerminalNode ISVOIDKEY() { return getToken(MyGrammerParser.ISVOIDKEY, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(84);
				((ExprContext)_localctx).calls = overwrite();
				}
				break;
			case IFKEY:
				{
				{
				setState(85);
				match(IFKEY);
				setState(86);
				expr();
				setState(87);
				match(THENKEY);
				setState(88);
				expr();
				setState(89);
				match(ELSEKEY);
				setState(90);
				expr();
				setState(91);
				match(FIKEY);
				}
				}
				break;
			case WHILEKEY:
				{
				{
				setState(93);
				match(WHILEKEY);
				setState(94);
				expr();
				setState(95);
				match(LOOPKEY);
				setState(96);
				expr();
				setState(97);
				match(POOLKEY);
				}
				}
				break;
			case LETKEY:
				{
				{
				setState(99);
				match(LETKEY);
				setState(100);
				match(ID);
				setState(101);
				match(T__5);
				setState(102);
				match(TYPE);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(103);
					match(T__7);
					setState(104);
					expr();
					}
				}

				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(107);
					match(T__6);
					setState(108);
					match(ID);
					setState(109);
					match(T__5);
					setState(110);
					match(TYPE);
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__7) {
						{
						setState(111);
						match(T__7);
						setState(112);
						expr();
						}
					}

					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(120);
				match(INKEY);
				setState(121);
				expr();
				}
				}
				break;
			case NEWKEY:
				{
				setState(122);
				((ExprContext)_localctx).newDeclaration = declaration();
				}
				break;
			case ISVOIDKEY:
				{
				{
				setState(123);
				match(ISVOIDKEY);
				setState(124);
				expr();
				}
				}
				break;
			case NOTKEY:
				{
				setState(125);
				match(NOTKEY);
				setState(126);
				expr();
				}
				break;
			case T__8:
				{
				setState(127);
				match(T__8);
				}
				break;
			case T__9:
				{
				setState(128);
				match(T__9);
				}
				break;
			case T__3:
				{
				setState(129);
				match(T__3);
				setState(130);
				expr();
				setState(131);
				match(T__4);
				}
				break;
			case INTEGERS:
				{
				setState(133);
				match(INTEGERS);
				}
				break;
			case STRING:
				{
				setState(134);
				match(STRING);
				}
				break;
			case T__1:
				{
				setState(135);
				((ExprContext)_localctx).innerExpr = multipleExpr();
				}
				break;
			case T__10:
				{
				setState(136);
				match(T__10);
				setState(137);
				expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(140);
			((ExprContext)_localctx).nextExpr = expr2();
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode NEWKEY() { return getToken(MyGrammerParser.NEWKEY, 0); }
		public TerminalNode TYPE() { return getToken(MyGrammerParser.TYPE, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(NEWKEY);
			setState(143);
			match(TYPE);
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

	public static class MultipleExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultipleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleExpr; }
	}

	public final MultipleExprContext multipleExpr() throws RecognitionException {
		MultipleExprContext _localctx = new MultipleExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_multipleExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__1);
			setState(149); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146);
				expr();
				setState(147);
				match(T__0);
				}
				}
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << IFKEY) | (1L << WHILEKEY) | (1L << LETKEY) | (1L << NEWKEY) | (1L << ISVOIDKEY) | (1L << NOTKEY) | (1L << ID) | (1L << INTEGERS) | (1L << STRING))) != 0) );
			setState(153);
			match(T__2);
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

	public static class Expr2Context extends ParserRuleContext {
		public MethodCallContext mCall;
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(MyGrammerParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MyGrammerParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(MyGrammerParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(MyGrammerParser.SLASH, 0); }
		public TerminalNode LOWERTHAN() { return getToken(MyGrammerParser.LOWERTHAN, 0); }
		public TerminalNode EQUALS() { return getToken(MyGrammerParser.EQUALS, 0); }
		public TerminalNode LOWEREQUAL() { return getToken(MyGrammerParser.LOWEREQUAL, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr2);
		int _la;
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
				case MINUS:
				case STAR:
				case SLASH:
				case LOWERTHAN:
				case EQUALS:
				case LOWEREQUAL:
					{
					setState(155);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << STAR) | (1L << SLASH) | (1L << LOWERTHAN) | (1L << EQUALS) | (1L << LOWEREQUAL))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(156);
					expr();
					}
					break;
				case T__11:
				case T__12:
					{
					setState(157);
					((Expr2Context)_localctx).mCall = methodCall();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(160);
				expr2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class MethodCallContext extends ParserRuleContext {
		public Token methodName;
		public TerminalNode ID() { return getToken(MyGrammerParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(MyGrammerParser.TYPE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(165);
				match(T__11);
				setState(166);
				match(TYPE);
				}
			}

			setState(169);
			match(T__12);
			setState(170);
			((MethodCallContext)_localctx).methodName = match(ID);
			setState(171);
			match(T__3);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << IFKEY) | (1L << WHILEKEY) | (1L << LETKEY) | (1L << NEWKEY) | (1L << ISVOIDKEY) | (1L << NOTKEY) | (1L << ID) | (1L << INTEGERS) | (1L << STRING))) != 0)) {
				{
				setState(172);
				expr();
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(173);
					match(T__6);
					setState(174);
					expr();
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(182);
			match(T__4);
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

	public static class OverwriteContext extends ParserRuleContext {
		public Token name;
		public AttrWriteContext attr;
		public FunCallContext fun;
		public TerminalNode ID() { return getToken(MyGrammerParser.ID, 0); }
		public AttrWriteContext attrWrite() {
			return getRuleContext(AttrWriteContext.class,0);
		}
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public OverwriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overwrite; }
	}

	public final OverwriteContext overwrite() throws RecognitionException {
		OverwriteContext _localctx = new OverwriteContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_overwrite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			((OverwriteContext)_localctx).name = match(ID);
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(185);
				((OverwriteContext)_localctx).attr = attrWrite();
				}
				break;
			case T__3:
				{
				setState(186);
				((OverwriteContext)_localctx).fun = funCall();
				}
				break;
			case T__0:
			case T__2:
			case T__4:
			case T__6:
			case T__11:
			case T__12:
			case PLUS:
			case MINUS:
			case STAR:
			case SLASH:
			case LOWERTHAN:
			case EQUALS:
			case LOWEREQUAL:
			case LOOPKEY:
			case ELSEKEY:
			case THENKEY:
			case FIKEY:
			case INKEY:
			case POOLKEY:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class AttrWriteContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AttrWriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrWrite; }
	}

	public final AttrWriteContext attrWrite() throws RecognitionException {
		AttrWriteContext _localctx = new AttrWriteContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_attrWrite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(190);
			match(T__7);
			setState(191);
			expr();
			}
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

	public static class FunCallContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FunCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funCall; }
	}

	public final FunCallContext funCall() throws RecognitionException {
		FunCallContext _localctx = new FunCallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__3);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << IFKEY) | (1L << WHILEKEY) | (1L << LETKEY) | (1L << NEWKEY) | (1L << ISVOIDKEY) | (1L << NOTKEY) | (1L << ID) | (1L << INTEGERS) | (1L << STRING))) != 0)) {
				{
				setState(194);
				expr();
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(195);
					match(T__6);
					setState(196);
					expr();
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(204);
			match(T__4);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u00d1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\5\3(\n\3\3\3\3\3\7\3,\n\3\f\3\16\3/\13\3\3\3\3\3\3\4\3\4\3"+
		"\4\5\4\66\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\7\6F\n\6\f\6\16\6I\13\6\5\6K\n\6\3\7\3\7\3\7\3\7\5\7Q\n\7\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\tl\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tt\n\t\7\tv\n\t"+
		"\f\t\16\ty\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u008d\n\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\6\13\u0098\n\13\r\13\16\13\u0099\3\13\3\13\3\f\3\f\3\f\5\f\u00a1\n"+
		"\f\3\f\3\f\3\f\5\f\u00a6\n\f\3\r\3\r\5\r\u00aa\n\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\7\r\u00b2\n\r\f\r\16\r\u00b5\13\r\5\r\u00b7\n\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\5\16\u00bf\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u00c8"+
		"\n\20\f\20\16\20\u00cb\13\20\5\20\u00cd\n\20\3\20\3\20\3\20\2\2\21\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36\2\3\3\2\21\27\2\u00e1\2 \3\2\2\2\4"+
		"#\3\2\2\2\6\62\3\2\2\2\b9\3\2\2\2\nJ\3\2\2\2\fL\3\2\2\2\16R\3\2\2\2\20"+
		"\u008c\3\2\2\2\22\u0090\3\2\2\2\24\u0093\3\2\2\2\26\u00a5\3\2\2\2\30\u00a9"+
		"\3\2\2\2\32\u00ba\3\2\2\2\34\u00c0\3\2\2\2\36\u00c3\3\2\2\2 !\5\4\3\2"+
		"!\"\7\3\2\2\"\3\3\2\2\2#$\7\35\2\2$\'\7&\2\2%&\7\36\2\2&(\7&\2\2\'%\3"+
		"\2\2\2\'(\3\2\2\2()\3\2\2\2)-\7\4\2\2*,\5\6\4\2+*\3\2\2\2,/\3\2\2\2-+"+
		"\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\7\5\2\2\61\5\3\2\2\2\62"+
		"\65\7\'\2\2\63\66\5\b\5\2\64\66\5\f\7\2\65\63\3\2\2\2\65\64\3\2\2\2\66"+
		"\67\3\2\2\2\678\7\3\2\28\7\3\2\2\29:\7\6\2\2:;\5\n\6\2;<\7\7\2\2<=\7\b"+
		"\2\2=>\7&\2\2>?\7\4\2\2?@\5\20\t\2@A\7\5\2\2A\t\3\2\2\2BG\5\16\b\2CD\7"+
		"\t\2\2DF\5\16\b\2EC\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HK\3\2\2\2IG"+
		"\3\2\2\2JB\3\2\2\2JK\3\2\2\2K\13\3\2\2\2LM\7\b\2\2MP\7&\2\2NO\7\n\2\2"+
		"OQ\5\20\t\2PN\3\2\2\2PQ\3\2\2\2Q\r\3\2\2\2RS\7\'\2\2ST\7\b\2\2TU\7&\2"+
		"\2U\17\3\2\2\2V\u008d\5\32\16\2WX\7\30\2\2XY\5\20\t\2YZ\7\33\2\2Z[\5\20"+
		"\t\2[\\\7\32\2\2\\]\5\20\t\2]^\7\37\2\2^\u008d\3\2\2\2_`\7\34\2\2`a\5"+
		"\20\t\2ab\7\31\2\2bc\5\20\t\2cd\7#\2\2d\u008d\3\2\2\2ef\7!\2\2fg\7\'\2"+
		"\2gh\7\b\2\2hk\7&\2\2ij\7\n\2\2jl\5\20\t\2ki\3\2\2\2kl\3\2\2\2lw\3\2\2"+
		"\2mn\7\t\2\2no\7\'\2\2op\7\b\2\2ps\7&\2\2qr\7\n\2\2rt\5\20\t\2sq\3\2\2"+
		"\2st\3\2\2\2tv\3\2\2\2um\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2"+
		"\2yw\3\2\2\2z{\7 \2\2{\u008d\5\20\t\2|\u008d\5\22\n\2}~\7$\2\2~\u008d"+
		"\5\20\t\2\177\u0080\7%\2\2\u0080\u008d\5\20\t\2\u0081\u008d\7\13\2\2\u0082"+
		"\u008d\7\f\2\2\u0083\u0084\7\6\2\2\u0084\u0085\5\20\t\2\u0085\u0086\7"+
		"\7\2\2\u0086\u008d\3\2\2\2\u0087\u008d\7-\2\2\u0088\u008d\7/\2\2\u0089"+
		"\u008d\5\24\13\2\u008a\u008b\7\r\2\2\u008b\u008d\5\20\t\2\u008cV\3\2\2"+
		"\2\u008cW\3\2\2\2\u008c_\3\2\2\2\u008ce\3\2\2\2\u008c|\3\2\2\2\u008c}"+
		"\3\2\2\2\u008c\177\3\2\2\2\u008c\u0081\3\2\2\2\u008c\u0082\3\2\2\2\u008c"+
		"\u0083\3\2\2\2\u008c\u0087\3\2\2\2\u008c\u0088\3\2\2\2\u008c\u0089\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\5\26\f\2\u008f"+
		"\21\3\2\2\2\u0090\u0091\7\"\2\2\u0091\u0092\7&\2\2\u0092\23\3\2\2\2\u0093"+
		"\u0097\7\4\2\2\u0094\u0095\5\20\t\2\u0095\u0096\7\3\2\2\u0096\u0098\3"+
		"\2\2\2\u0097\u0094\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\7\5\2\2\u009c\25\3\2\2"+
		"\2\u009d\u009e\t\2\2\2\u009e\u00a1\5\20\t\2\u009f\u00a1\5\30\r\2\u00a0"+
		"\u009d\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\5\26"+
		"\f\2\u00a3\u00a6\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a0\3\2\2\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6\27\3\2\2\2\u00a7\u00a8\7\16\2\2\u00a8\u00aa\7&\2"+
		"\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac"+
		"\7\17\2\2\u00ac\u00ad\7\'\2\2\u00ad\u00b6\7\6\2\2\u00ae\u00b3\5\20\t\2"+
		"\u00af\u00b0\7\t\2\2\u00b0\u00b2\5\20\t\2\u00b1\u00af\3\2\2\2\u00b2\u00b5"+
		"\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00ae\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00b9\7\7\2\2\u00b9\31\3\2\2\2\u00ba\u00be\7\'\2\2\u00bb\u00bf"+
		"\5\34\17\2\u00bc\u00bf\5\36\20\2\u00bd\u00bf\3\2\2\2\u00be\u00bb\3\2\2"+
		"\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\33\3\2\2\2\u00c0\u00c1"+
		"\7\n\2\2\u00c1\u00c2\5\20\t\2\u00c2\35\3\2\2\2\u00c3\u00cc\7\6\2\2\u00c4"+
		"\u00c9\5\20\t\2\u00c5\u00c6\7\t\2\2\u00c6\u00c8\5\20\t\2\u00c7\u00c5\3"+
		"\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00c4\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\7\7\2\2\u00cf\37\3\2\2\2\25\'-\65"+
		"GJPksw\u008c\u0099\u00a0\u00a5\u00a9\u00b3\u00b6\u00be\u00c9\u00cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}