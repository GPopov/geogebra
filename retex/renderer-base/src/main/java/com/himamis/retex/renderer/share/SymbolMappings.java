package com.himamis.retex.renderer.share;

import java.util.HashMap;
import java.util.Map;

public class SymbolMappings {

	private static final String DOT_FONT = "jlm_cmss10"; // default
															// jlm_cmmi10_unchanged
	private static final int DOT_CHAR = 46; // default 58

	private static Map<String, CharFont> map = new HashMap<String, CharFont>();
	static {

		add("comma", 59, "jlm_cmmi10_unchanged");
		add("ldotp", DOT_CHAR, DOT_FONT);
		add("cdotp", 162, "jlm_cmsy10");
		add("normaldot", DOT_CHAR, DOT_FONT);
		add("textnormaldot", DOT_CHAR, DOT_FONT);
		add("slash", 61, "jlm_cmmi10_unchanged");
		add("guillemotleft", 33, "jlm_jlmi10");
		add("guillemotright", 36, "jlm_jlmi10");
		add("guilsinglleft", 34, "jlm_jlmi10");
		add("guilsinglright", 35, "jlm_jlmi10");
		add("og", 33, "jlm_jlmi10");
		add("fg", 36, "jlm_jlmi10");
		add("textperthousand", 37, "jlm_jlmr10");
		add("textpertenthousand", 38, "jlm_jlmr10");
		add("textdbend", 126, "jlm_jlmr10_unchanged");
		add("dbend", 127, "jlm_jlmr10_unchanged");
		add("sqrt", 112, "jlm_cmsy10");
		add("textfractionsolidus", 47, "jlm_cmr10");
		add("textminus", 45, "jlm_cmr10");
		add("textendash", 123, "jlm_cmr10");
		add("textemdash", 124, "jlm_cmr10");
		add("semicolon", 59, "jlm_cmr10");
		add("faculty", 33, "jlm_cmr10");
		add("question", 63, "jlm_cmr10");
		add("questiondown", 62, "jlm_cmr10");
		add("jlatexmathsharp", 35, "jlm_cmr10");
		add("textdollar", 36, "jlm_cmr10");
		add("textpercent", 37, "jlm_cmr10");
		add("textampersand", 38, "jlm_cmr10");
		add("jlatexmatharobase", 64, "jlm_cmr10");
		add("textapos", 39, "jlm_cmr10");
		add("jlatexmathlapos", 96, "jlm_cmr10");
		add("mathsterling", 36, "jlm_cmti10_unchanged");
		add("oe", 190, "jlm_cmti10");
		add("ae", 189, "jlm_cmti10");
		add("OE", 193, "jlm_cmti10");
		add("AE", 192, "jlm_cmti10");
		add("ss", 188, "jlm_cmti10");
		add("o", 191, "jlm_cmti10");
		add("O", 194, "jlm_cmti10");
		add("tie", 196, "jlm_cmmi10_unchanged");
		add("i", 179, "jlm_cmti10");
		add("j", 180, "jlm_cmti10");
		add("jlatexmathcedilla", 187, "jlm_cmti10");
		add("lq", 96, "jlm_cmti10");
		add("rq", 39, "jlm_cmti10");
		add("acute", 182, "jlm_cmr10");
		add("grave", 181, "jlm_cmr10");
		add("ddot", 196, "jlm_cmr10");
		add("doubleacute", 125, "jlm_cmr10");
		add("tilde", 126, "jlm_cmr10");
		add("mathring", 186, "jlm_cmr10");
		add("jlatexmathring", 186, "jlm_cmr10");
		add("bar", 185, "jlm_cmr10");
		add("breve", 184, "jlm_cmr10");
		add("check", 183, "jlm_cmr10");
		add("hat", 94, "jlm_cmr10");
		add("ogonek", 197, "jlm_cmr10");
		add("polishlcross", 195, "jlm_cmr10");
		add("vec", 126, "jlm_cmmi10_unchanged");
		add("dot", 95, "jlm_cmr10");
		add("widehat", 98, "jlm_cmex10");
		add("widetilde", 101, "jlm_cmex10");
		add("lbrace", 102, "jlm_cmsy10");
		add("rbrace", 103, "jlm_cmsy10");
		add("lbrack", 40, "jlm_cmr10");
		add("rbrack", 41, "jlm_cmr10");
		add("rsqbrack", 93, "jlm_cmr10");
		add("lsqbrack", 91, "jlm_cmr10");
		add("langle", 104, "jlm_cmsy10");
		add("rangle", 105, "jlm_cmsy10");
		add("lfloor", 98, "jlm_cmsy10");
		add("rfloor", 99, "jlm_cmsy10");
		add("lceil", 100, "jlm_cmsy10");
		add("rceil", 101, "jlm_cmsy10");
		add("uparrow", 34, "jlm_cmsy10");
		add("Uparrow", 42, "jlm_cmsy10");
		add("downarrow", 35, "jlm_cmsy10");
		add("Downarrow", 43, "jlm_cmsy10");
		add("updownarrow", 108, "jlm_cmsy10");
		add("Updownarrow", 109, "jlm_cmsy10");
		add("vert", 106, "jlm_cmsy10");
		add("Vert", 107, "jlm_cmsy10");
		add("slashdel", 47, "jlm_cmr10");
		add("lgroup", 58, "jlm_cmex10");
		add("rgroup", 59, "jlm_cmex10");
		add("bracevert", 62, "jlm_cmex10");
		add("lmoustache", 64, "jlm_moustache");
		add("rmoustache", 65, "jlm_moustache");
		add("alpha", 174, "jlm_cmmi10_unchanged");
		add("beta", 175, "jlm_cmmi10_unchanged");
		add("gamma", 176, "jlm_cmmi10_unchanged");
		add("delta", 177, "jlm_cmmi10_unchanged");
		add("epsilon", 178, "jlm_cmmi10_unchanged");
		add("varepsilon", 34, "jlm_cmmi10_unchanged");
		add("zeta", 179, "jlm_cmmi10_unchanged");
		add("eta", 180, "jlm_cmmi10_unchanged");
		add("theta", 181, "jlm_cmmi10_unchanged");
		add("vartheta", 35, "jlm_cmmi10_unchanged");
		add("iota", 182, "jlm_cmmi10_unchanged");
		add("kappa", 183, "jlm_cmmi10_unchanged");
		add("lambda", 184, "jlm_cmmi10_unchanged");
		add("mu", 185, "jlm_cmmi10_unchanged");
		add("nu", 186, "jlm_cmmi10_unchanged");
		add("xi", 187, "jlm_cmmi10_unchanged");
		add("omicron", 111, "jlm_cmmi10_unchanged");
		add("pi", 188, "jlm_cmmi10_unchanged");
		add("varpi", 36, "jlm_cmmi10_unchanged");
		add("rho", 189, "jlm_cmmi10_unchanged");
		add("varrho", 37, "jlm_cmmi10_unchanged");
		add("sigma", 190, "jlm_cmmi10_unchanged");
		add("varsigma", 38, "jlm_cmmi10_unchanged");
		add("tau", 191, "jlm_cmmi10_unchanged");
		add("upsilon", 192, "jlm_cmmi10_unchanged");
		add("phi", 193, "jlm_cmmi10_unchanged");
		add("varphi", 39, "jlm_cmmi10_unchanged");
		add("chi", 194, "jlm_cmmi10_unchanged");
		add("psi", 195, "jlm_cmmi10_unchanged");
		add("omega", 33, "jlm_cmmi10_unchanged");
		add("Gamma", 161, "jlm_cmr10");
		add("Delta", 162, "jlm_cmr10");
		add("Theta", 163, "jlm_cmr10");
		add("Lambda", 164, "jlm_cmr10");
		add("Xi", 165, "jlm_cmr10");
		add("Pi", 166, "jlm_cmr10");
		add("Sigma", 167, "jlm_cmr10");
		add("Upsilon", 168, "jlm_cmr10");
		add("Phi", 169, "jlm_cmr10");
		add("Psi", 170, "jlm_cmr10");
		add("Omega", 173, "jlm_cmr10");
		add("varGamma", 161, "jlm_cmmi10");
		add("varDelta", 162, "jlm_cmmi10");
		add("varTheta", 163, "jlm_cmmi10");
		add("varLambda", 164, "jlm_cmmi10");
		add("varXi", 165, "jlm_cmmi10");
		add("varPi", 166, "jlm_cmmi10");
		add("varSigma", 167, "jlm_cmmi10");
		add("varUpsilon", 168, "jlm_cmmi10");
		add("varPhi", 169, "jlm_cmmi10");
		add("varPsi", 170, "jlm_cmmi10");
		add("varOmega", 173, "jlm_cmmi10");
		add("aleph", 64, "jlm_cmsy10");
		add("imath", 123, "jlm_cmmi10_unchanged");
		add("jmath", 124, "jlm_cmmi10_unchanged");
		add("ell", 96, "jlm_cmmi10_unchanged");
		add("wp", 125, "jlm_cmmi10_unchanged");
		add("Re", 60, "jlm_cmsy10");
		add("Im", 61, "jlm_cmsy10");
		add("partial", 64, "jlm_cmmi10_unchanged");
		add("infty", 49, "jlm_cmsy10");
		add("prime", 48, "jlm_cmsy10");
		add("emptyset", 59, "jlm_cmsy10");
		add("nabla", 114, "jlm_cmsy10");
		add("surdsign", 112, "jlm_cmsy10");
		add("top", 62, "jlm_cmsy10");
		add("bot", 63, "jlm_cmsy10");
		add("|", 107, "jlm_cmsy10");
		add("triangle", 52, "jlm_cmsy10");
		add("backslash", 110, "jlm_cmsy10");
		add("forall", 56, "jlm_cmsy10");
		add("exists", 57, "jlm_cmsy10");
		add("neg", 58, "jlm_cmsy10");
		add("lnot", 58, "jlm_cmsy10");
		add("flat", 91, "jlm_cmmi10_unchanged");
		add("natural", 92, "jlm_cmmi10_unchanged");
		add("sharp", 93, "jlm_cmmi10_unchanged");
		add("S", 120, "jlm_cmsy10");
		add("P", 123, "jlm_cmsy10");
		add("clubsuit", 124, "jlm_cmsy10");
		add("diamondsuit", 125, "jlm_cmsy10");
		add("heartsuit", 126, "jlm_cmsy10");
		add("spadesuit", 196, "jlm_cmsy10");
		add("lacc", 102, "jlm_cmsy10");
		add("racc", 103, "jlm_cmsy10");
		add("Relbar", 61, "jlm_cmr10");
		add("lhook", 44, "jlm_cmmi10_unchanged");
		add("rhook", 45, "jlm_cmmi10_unchanged");
		add("mapstochar", 55, "jlm_cmsy10");
		add("bigcap", 84, "jlm_cmex10");
		add("bigcup", 83, "jlm_cmex10");
		add("bigodot", 74, "jlm_cmex10");
		add("bigoplus", 76, "jlm_cmex10");
		add("bigotimes", 78, "jlm_cmex10");
		add("bigsqcup", 70, "jlm_cmex10");
		add("biguplus", 85, "jlm_cmex10");
		add("bigvee", 87, "jlm_cmex10");
		add("bigwedge", 86, "jlm_cmex10");
		add("coprod", 96, "jlm_cmex10");
		add("int", 82, "jlm_cmex10");
		add("oint", 72, "jlm_cmex10");
		add("sum", 80, "jlm_cmex10");
		add("prod", 81, "jlm_cmex10");
		add("smallint", 115, "jlm_cmsy10");
		add("minus", 161, "jlm_cmsy10");
		add("plus", 43, "jlm_cmr10");
		add("pm", 167, "jlm_cmsy10");
		add("mp", 168, "jlm_cmsy10");
		add("setminus", 110, "jlm_cmsy10");
		add("cdot", 162, "jlm_cmsy10");
		add("times", 163, "jlm_cmsy10");
		add("ast", 164, "jlm_cmsy10");
		add("star", 63, "jlm_cmmi10_unchanged");
		add("diamond", 166, "jlm_cmsy10");
		add("circ", 177, "jlm_cmsy10");
		add("bullet", 178, "jlm_cmsy10");
		add("div", 165, "jlm_cmsy10");
		add("cap", 92, "jlm_cmsy10");
		add("cup", 91, "jlm_cmsy10");
		add("uplus", 93, "jlm_cmsy10");
		add("sqcap", 117, "jlm_cmsy10");
		add("sqcup", 116, "jlm_cmsy10");
		add("triangleleft", 47, "jlm_cmmi10_unchanged");
		add("triangleright", 46, "jlm_cmmi10_unchanged");
		add("wr", 111, "jlm_cmsy10");
		add("bigcirc", 176, "jlm_cmsy10");
		add("vee", 95, "jlm_cmsy10");
		add("lor", 95, "jlm_cmsy10");
		add("wedge", 94, "jlm_cmsy10");
		add("land", 94, "jlm_cmsy10");
		add("oplus", 169, "jlm_cmsy10");
		add("ominus", 170, "jlm_cmsy10");
		add("otimes", 172, "jlm_cmsy10");
		add("oslash", 174, "jlm_cmsy10");
		add("odot", 175, "jlm_cmsy10");
		add("dagger", 121, "jlm_cmsy10");
		add("ddagger", 122, "jlm_cmsy10");
		add("amalg", 113, "jlm_cmsy10");
		add("equals", 61, "jlm_cmr10");
		add("gt", 62, "jlm_cmmi10_unchanged");
		add("lt", 60, "jlm_cmmi10_unchanged");
		add("leq", 183, "jlm_cmsy10");
		add("le", 183, "jlm_cmsy10");
		add("prec", 193, "jlm_cmsy10");
		add("preceq", 185, "jlm_cmsy10");
		add("ll", 191, "jlm_cmsy10");
		add("subset", 189, "jlm_cmsy10");
		add("subseteq", 181, "jlm_cmsy10");
		add("sqsubseteq", 118, "jlm_cmsy10");
		add("in", 50, "jlm_cmsy10");
		add("vdash", 96, "jlm_cmsy10");
		add("smile", 94, "jlm_cmmi10_unchanged");
		add("frown", 95, "jlm_cmmi10_unchanged");
		add("geq", 184, "jlm_cmsy10");
		add("ge", 184, "jlm_cmsy10");
		add("succ", 194, "jlm_cmsy10");
		add("succeq", 186, "jlm_cmsy10");
		add("gg", 192, "jlm_cmsy10");
		add("supset", 190, "jlm_cmsy10");
		add("supseteq", 182, "jlm_cmsy10");
		add("sqsupseteq", 119, "jlm_cmsy10");
		add("ni", 51, "jlm_cmsy10");
		add("owns", 51, "jlm_cmsy10");
		add("dashv", 97, "jlm_cmsy10");
		add("mid", 106, "jlm_cmsy10");
		add("parallel", 107, "jlm_cmsy10");
		add("equiv", 180, "jlm_cmsy10");
		add("sim", 187, "jlm_cmsy10");
		add("simeq", 39, "jlm_cmsy10");
		add("asymp", 179, "jlm_cmsy10");
		add("approx", 188, "jlm_cmsy10");
		add("propto", 47, "jlm_cmsy10");
		add("perp", 63, "jlm_cmsy10");
		add("not", 54, "jlm_cmsy10");
		add("colon", 58, "jlm_cmr10");
		add("nearrow", 37, "jlm_cmsy10");
		add("searrow", 38, "jlm_cmsy10");
		add("swarrow", 46, "jlm_cmsy10");
		add("nwarrow", 45, "jlm_cmsy10");
		add("leftarrow", 195, "jlm_cmsy10");
		add("gets", 195, "jlm_cmsy10");
		add("Leftarrow", 40, "jlm_cmsy10");
		add("rightarrow", 33, "jlm_cmsy10");
		add("to", 33, "jlm_cmsy10");
		add("Rightarrow", 41, "jlm_cmsy10");
		add("leftrightarrow", 36, "jlm_cmsy10");
		add("Leftrightarrow", 44, "jlm_cmsy10");
		add("leftharpoonup", 40, "jlm_cmmi10_unchanged");
		add("leftharpoondown", 41, "jlm_cmmi10_unchanged");
		add("rightharpoonup", 42, "jlm_cmmi10_unchanged");
		add("rightharpoondown", 43, "jlm_cmmi10_unchanged");
		// amsfont
		add("boxdot", 161, "jlm_msam10");
		add("boxplus", 162, "jlm_msam10");
		add("boxtimes", 163, "jlm_msam10");
		add("square", 164, "jlm_msam10");
		add("blacksquare", 165, "jlm_msam10");
		add("centerdot", 166, "jlm_msam10");
		add("lozenge", 167, "jlm_msam10");
		add("blacklozenge", 168, "jlm_msam10");
		add("circlearrowright", 169, "jlm_msam10");
		add("circlearrowleft", 170, "jlm_msam10");
		add("leftrightharpoons", 174, "jlm_msam10");
		add("boxminus", 175, "jlm_msam10");
		add("Vdash", 176, "jlm_msam10");
		add("Vvdash", 177, "jlm_msam10");
		add("vDash", 178, "jlm_msam10");
		add("twoheadrightarrow", 179, "jlm_msam10");
		add("twoheadleftarrow", 180, "jlm_msam10");
		add("leftleftarrows", 181, "jlm_msam10");
		add("rightrightarrows", 182, "jlm_msam10");
		add("upuparrows", 183, "jlm_msam10");
		add("downdownarrows", 184, "jlm_msam10");
		add("upharpoonright", 185, "jlm_msam10");
		add("downharpoonright", 186, "jlm_msam10");
		add("upharpoonleft", 187, "jlm_msam10");
		add("downharpoonleft", 188, "jlm_msam10");
		add("rightarrowtail", 189, "jlm_msam10");
		add("leftarrowtail", 190, "jlm_msam10");
		add("leftrightarrows", 191, "jlm_msam10");
		add("rightleftarrows", 192, "jlm_msam10");
		add("Lsh", 193, "jlm_msam10");
		add("Rsh", 194, "jlm_msam10");
		add("rightsquigarrow", 195, "jlm_msam10");
		add("leftrightsquigarrow", 33, "jlm_msam10");
		add("looparrowleft", 34, "jlm_msam10");
		add("looparrowright", 35, "jlm_msam10");
		add("circeq", 36, "jlm_msam10");
		add("succsim", 37, "jlm_msam10");
		add("gtrsim", 38, "jlm_msam10");
		add("gtrapprox", 39, "jlm_msam10");
		add("multimap", 40, "jlm_msam10");
		add("therefore", 41, "jlm_msam10");
		add("because", 42, "jlm_msam10");
		add("doteqdot", 43, "jlm_msam10");
		add("triangleq", 44, "jlm_msam10");
		add("precsim", 45, "jlm_msam10");
		add("lesssim", 46, "jlm_msam10");
		add("lessapprox", 47, "jlm_msam10");
		add("eqslantless", 48, "jlm_msam10");
		add("eqslantgtr", 49, "jlm_msam10");
		add("curlyeqprec", 50, "jlm_msam10");
		add("curlyeqsucc", 51, "jlm_msam10");
		add("preccurlyeq", 52, "jlm_msam10");
		add("leqq", 53, "jlm_msam10");
		add("leqslant", 54, "jlm_msam10");
		add("lessgtr", 55, "jlm_msam10");
		add("backprime", 56, "jlm_msam10");
		add("risingdotseq", 58, "jlm_msam10");
		add("fallingdotseq", 59, "jlm_msam10");
		add("succcurlyeq", 60, "jlm_msam10");
		add("geqq", 61, "jlm_msam10");
		add("geqslant", 62, "jlm_msam10");
		add("gtrless", 63, "jlm_msam10");
		add("vartriangleright", 66, "jlm_msam10");
		add("vartriangleleft", 67, "jlm_msam10");
		add("trianglerighteq", 68, "jlm_msam10");
		add("trianglelefteq", 69, "jlm_msam10");
		add("bigstar", 70, "jlm_msam10");
		add("between", 71, "jlm_msam10");
		add("blacktriangledown", 72, "jlm_msam10");
		add("blacktriangleright", 73, "jlm_msam10");
		add("blacktriangleleft", 74, "jlm_msam10");
		add("vartriangle", 77, "jlm_msam10");
		add("blacktriangle", 78, "jlm_msam10");
		add("triangledown", 79, "jlm_msam10");
		add("eqcirc", 80, "jlm_msam10");
		add("lesseqgtr", 81, "jlm_msam10");
		add("gtreqless", 82, "jlm_msam10");
		add("lesseqqgtr", 83, "jlm_msam10");
		add("gtreqqless", 84, "jlm_msam10");
		add("yen", 85, "jlm_msam10");
		add("Rrightarrow", 86, "jlm_msam10");
		add("Lleftarrow", 87, "jlm_msam10");
		add("checkmark", 88, "jlm_msam10");
		add("veebar", 89, "jlm_msam10");
		add("barwedge", 90, "jlm_msam10");
		add("doublebarwedge", 91, "jlm_msam10");
		add("measuredangle", 93, "jlm_msam10");
		add("sphericalangle", 94, "jlm_msam10");
		add("varpropto", 95, "jlm_msam10");
		add("smallsmile", 96, "jlm_msam10");
		add("smallfrown", 97, "jlm_msam10");
		add("Subset", 98, "jlm_msam10");
		add("Supset", 99, "jlm_msam10");
		add("Cup", 100, "jlm_msam10");
		add("Cap", 101, "jlm_msam10");
		add("curlywedge", 102, "jlm_msam10");
		add("curlyvee", 103, "jlm_msam10");
		add("leftthreetimes", 104, "jlm_msam10");
		add("rightthreetimes", 105, "jlm_msam10");
		add("subseteqq", 106, "jlm_msam10");
		add("supseteqq", 107, "jlm_msam10");
		add("bumpeq", 108, "jlm_msam10");
		add("Bumpeq", 109, "jlm_msam10");
		add("lll", 110, "jlm_msam10");
		add("ggg", 111, "jlm_msam10");
		add("ulcorner", 112, "jlm_msam10");
		add("urcorner", 113, "jlm_msam10");
		add("textregistered", 114, "jlm_msam10");
		add("circledS", 115, "jlm_msam10");
		add("pitchfork", 116, "jlm_msam10");
		add("dotplus", 117, "jlm_msam10");
		add("backsim", 118, "jlm_msam10");
		add("backsimeq", 119, "jlm_msam10");
		add("llcorner", 120, "jlm_msam10");
		add("lrcorner", 121, "jlm_msam10");
		add("maltese", 122, "jlm_msam10");
		add("complement", 123, "jlm_msam10");
		add("intercal", 124, "jlm_msam10");
		add("circledcirc", 125, "jlm_msam10");
		add("circledast", 126, "jlm_msam10");
		add("circleddash", 196, "jlm_msam10");
		add("lvertneqq", 161, "jlm_msbm10");
		add("gvertneqq", 162, "jlm_msbm10");
		add("nleq", 163, "jlm_msbm10");
		add("ngeq", 164, "jlm_msbm10");
		add("nless", 165, "jlm_msbm10");
		add("ngtr", 166, "jlm_msbm10");
		add("nprec", 167, "jlm_msbm10");
		add("nsucc", 168, "jlm_msbm10");
		add("lneqq", 169, "jlm_msbm10");
		add("gneqq", 170, "jlm_msbm10");
		add("nleqslant", 173, "jlm_msbm10");
		add("ngeqslant", 174, "jlm_msbm10");
		add("lneq", 175, "jlm_msbm10");
		add("gneq", 176, "jlm_msbm10");
		add("npreceq", 177, "jlm_msbm10");
		add("nsucceq", 178, "jlm_msbm10");
		add("precnsim", 179, "jlm_msbm10");
		add("succnsim", 180, "jlm_msbm10");
		add("lnsim", 181, "jlm_msbm10");
		add("gnsim", 182, "jlm_msbm10");
		add("nleqq", 183, "jlm_msbm10");
		add("ngeqq", 184, "jlm_msbm10");
		add("precneqq", 185, "jlm_msbm10");
		add("succneqq", 186, "jlm_msbm10");
		add("precnapprox", 187, "jlm_msbm10");
		add("succnapprox", 188, "jlm_msbm10");
		add("lnapprox", 189, "jlm_msbm10");
		add("gnapprox", 190, "jlm_msbm10");
		add("nsim", 191, "jlm_msbm10");
		add("ncong", 192, "jlm_msbm10");
		add("diagup", 193, "jlm_msbm10");
		add("diagdown", 194, "jlm_msbm10");
		add("varsubsetneq", 195, "jlm_msbm10");
		add("varsupsetneq", 33, "jlm_msbm10");
		add("nsubseteqq", 34, "jlm_msbm10");
		add("nsupseteqq", 35, "jlm_msbm10");
		add("subsetneqq", 36, "jlm_msbm10");
		add("supsetneqq", 37, "jlm_msbm10");
		add("varsubsetneqq", 38, "jlm_msbm10");
		add("varsupsetneqq", 39, "jlm_msbm10");
		add("subsetneq", 40, "jlm_msbm10");
		add("supsetneq", 41, "jlm_msbm10");
		add("nsubseteq", 42, "jlm_msbm10");
		add("nsupseteq", 43, "jlm_msbm10");
		add("nparallel", 44, "jlm_msbm10");
		add("nmid", 45, "jlm_msbm10");
		add("nshortmid", 46, "jlm_msbm10");
		add("nshortparallel", 47, "jlm_msbm10");
		add("nvdash", 48, "jlm_msbm10");
		add("nVdash", 49, "jlm_msbm10");
		add("nvDash", 50, "jlm_msbm10");
		add("nVDash", 51, "jlm_msbm10");
		add("ntrianglerighteq", 52, "jlm_msbm10");
		add("ntrianglelefteq", 53, "jlm_msbm10");
		add("ntriangleleft", 54, "jlm_msbm10");
		add("ntriangleright", 55, "jlm_msbm10");
		add("nleftarrow", 56, "jlm_msbm10");
		add("nrightarrow", 57, "jlm_msbm10");
		add("nLeftarrow", 58, "jlm_msbm10");
		add("nRightarrow", 59, "jlm_msbm10");
		add("nLeftrightarrow", 60, "jlm_msbm10");
		add("nleftrightarrow", 61, "jlm_msbm10");
		add("divideontimes", 62, "jlm_msbm10");
		add("varnothing", 63, "jlm_msbm10");
		add("nexists", 64, "jlm_msbm10");
		add("Finv", 96, "jlm_msbm10");
		add("Game", 97, "jlm_msbm10");
		add("eth", 103, "jlm_msbm10");
		add("eqsim", 104, "jlm_msbm10");
		add("beth", 105, "jlm_msbm10");
		add("gimel", 106, "jlm_msbm10");
		add("daleth", 107, "jlm_msbm10");
		add("lessdot", 108, "jlm_msbm10");
		add("gtrdot", 109, "jlm_msbm10");
		add("ltimes", 110, "jlm_msbm10");
		add("rtimes", 111, "jlm_msbm10");
		add("shortmid", 112, "jlm_msbm10");
		add("shortparallel", 113, "jlm_msbm10");
		add("smallsetminus", 114, "jlm_msbm10");
		add("thicksim", 115, "jlm_msbm10");
		add("thickapprox", 116, "jlm_msbm10");
		add("approxeq", 117, "jlm_msbm10");
		add("succapprox", 118, "jlm_msbm10");
		add("precapprox", 119, "jlm_msbm10");
		add("curvearrowleft", 120, "jlm_msbm10");
		add("curvearrowright", 121, "jlm_msbm10");
		add("digamma", 122, "jlm_msbm10");
		add("varkappa", 123, "jlm_msbm10");
		add("Bbbk", 124, "jlm_msbm10");
		add("hslash", 125, "jlm_msbm10");
		add("backepsilon", 196, "jlm_msbm10");
		// amssymb
		add("rightleftharpoons", 173, "jlm_msam10");
		add("angle", 92, "jlm_msam10");
		add("hbar", 126, "jlm_msbm10");
		add("sqsubset", 64, "jlm_msam10");
		add("sqsupset", 65, "jlm_msam10");
		add("mho", 102, "jlm_msbm10");
		add("Box", 164, "jlm_msam10");
		add("Diamond", 167, "jlm_msam10");
		add("leadsto", 195, "jlm_msam10");
		add("lhd", 67, "jlm_msam10");
		add("unlhd", 69, "jlm_msam10");
		add("rhd", 66, "jlm_msam10");
		add("unrhd", 68, "jlm_msam10");
		add("jlmEuler", 101, "jlm_cmmi10_unchanged");
		// stmaryrd
		add("shortleftarrow", 32, "jlm_stmary10");
		add("shortrightarrow", 33, "jlm_stmary10");
		add("shortuparrow", 34, "jlm_stmary10");
		add("shortdownarrow", 35, "jlm_stmary10");
		add("Yup", 36, "jlm_stmary10");
		add("Ydown", 37, "jlm_stmary10");
		add("Yleft", 38, "jlm_stmary10");
		add("Yright", 39, "jlm_stmary10");
		add("varcurlyvee", 40, "jlm_stmary10");
		add("varcurlywedge", 41, "jlm_stmary10");
		add("minuso", 42, "jlm_stmary10");
		add("baro", 43, "jlm_stmary10");
		add("sslash", 44, "jlm_stmary10");
		add("bbslash", 45, "jlm_stmary10");
		add("moo", 46, "jlm_stmary10");
		add("varotimes", 47, "jlm_stmary10");
		add("varoast", 48, "jlm_stmary10");
		add("varobar", 49, "jlm_stmary10");
		add("varodot", 50, "jlm_stmary10");
		add("varoslash", 51, "jlm_stmary10");
		add("varobslash", 52, "jlm_stmary10");
		add("varocircle", 53, "jlm_stmary10");
		add("varoplus", 54, "jlm_stmary10");
		add("varominus", 55, "jlm_stmary10");
		add("boxast", 56, "jlm_stmary10");
		add("boxbar", 57, "jlm_stmary10");
		add("boxdot", 58, "jlm_stmary10");
		add("boxslash", 59, "jlm_stmary10");
		add("boxbslash", 60, "jlm_stmary10");
		add("boxcircle", 61, "jlm_stmary10");
		add("boxbox", 62, "jlm_stmary10");
		add("boxempty", 63, "jlm_stmary10");
		add("lightning", 64, "jlm_stmary10");
		add("merge", 65, "jlm_stmary10");
		add("vartimes", 66, "jlm_stmary10");
		add("fatsemi", 67, "jlm_stmary10");
		add("sswarrow", 68, "jlm_stmary10");
		add("ssearrow", 69, "jlm_stmary10");
		add("curlywedgeuparrow", 70, "jlm_stmary10");
		add("curlywedgedownarrow", 71, "jlm_stmary10");
		add("fatslash", 72, "jlm_stmary10");
		add("fatbslash", 73, "jlm_stmary10");
		add("lbag", 74, "jlm_stmary10");
		add("rbag", 75, "jlm_stmary10");
		add("varbigcirc", 76, "jlm_stmary10");
		add("leftrightarroweq", 77, "jlm_stmary10");
		add("curlyveedownarrow", 78, "jlm_stmary10");
		add("curlyveeuparrow", 79, "jlm_stmary10");
		add("nnwarrow", 80, "jlm_stmary10");
		add("nnearrow", 81, "jlm_stmary10");
		add("leftslice", 82, "jlm_stmary10");
		add("rightslice", 83, "jlm_stmary10");
		add("varolessthan", 84, "jlm_stmary10");
		add("varogreaterthan", 85, "jlm_stmary10");
		add("varovee", 86, "jlm_stmary10");
		add("varowedge", 87, "jlm_stmary10");
		add("talloblong", 88, "jlm_stmary10");
		add("interleave", 89, "jlm_stmary10");
		add("obar", 90, "jlm_stmary10");
		add("obslash", 91, "jlm_stmary10");
		add("olessthan", 92, "jlm_stmary10");
		add("ogreaterthan", 93, "jlm_stmary10");
		add("ovee", 94, "jlm_stmary10");
		add("owedge", 95, "jlm_stmary10");
		add("oblong", 96, "jlm_stmary10");
		add("inplus", 97, "jlm_stmary10");
		add("niplus", 98, "jlm_stmary10");
		add("nplus", 99, "jlm_stmary10");
		add("subsetplus", 100, "jlm_stmary10");
		add("supsetplus", 101, "jlm_stmary10");
		add("subsetpluseq", 102, "jlm_stmary10");
		add("supsetpluseq", 103, "jlm_stmary10");
		add("Lbag", 104, "jlm_stmary10");
		add("Rbag", 105, "jlm_stmary10");
		add("llbracket", 106, "jlm_stmary10");
		add("rrbracket", 107, "jlm_stmary10");
		add("llparenthesis", 108, "jlm_stmary10");
		add("rrparenthesis", 109, "jlm_stmary10");
		add("binampersand", 110, "jlm_stmary10");
		add("bindnasrepma", 111, "jlm_stmary10");
		add("trianglelefteqslant", 112, "jlm_stmary10");
		add("trianglerighteqslant", 113, "jlm_stmary10");
		add("ntrianglelefteqslant", 114, "jlm_stmary10");
		add("ntrianglerighteqslant", 115, "jlm_stmary10");
		add("llfloor", 116, "jlm_stmary10");
		add("rrfloor", 117, "jlm_stmary10");
		add("llceil", 118, "jlm_stmary10");
		add("rrceil", 119, "jlm_stmary10");
		add("arrownot", 120, "jlm_stmary10");
		add("Arrownot", 121, "jlm_stmary10");
		add("Mapstochar", 122, "jlm_stmary10");
		add("mapsfromchar", 123, "jlm_stmary10");
		add("Mapsfromchar", 124, "jlm_stmary10");
		add("leftrightarrowtriangle", 125, "jlm_stmary10");
		add("leftarrowtriangle", 126, "jlm_stmary10");
		add("rightarrowtriangle", 127, "jlm_stmary10");
		add("bigtriangledown", 128, "jlm_stmary10");
		add("bigtriangleup", 129, "jlm_stmary10");
		add("bigcurlyvee", 130, "jlm_stmary10");
		add("bigcurlywedge", 131, "jlm_stmary10");
		add("bigsqcap", 132, "jlm_stmary10");
		add("bigbox", 133, "jlm_stmary10");
		add("bigparallel", 134, "jlm_stmary10");
		add("biginterleave", 135, "jlm_stmary10");
		add("bignplus", 136, "jlm_stmary10");
		// special
		add("euro", 69, "jlm_special");
		add("texteuro", 101, "jlm_special");
		add("textmu", 109, "jlm_special");
	}

	public static Map<String, CharFont> getMap() {
		return map;
	}

	private static void add(String string, int ch, String fontId) {
		try {
		map.put(string, new CharFont((char) ch,
					DefaultTeXFontParser.Font_ID.indexOf(fontId)));
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

}