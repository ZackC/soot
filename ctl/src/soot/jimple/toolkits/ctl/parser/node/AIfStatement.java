/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.toolkits.ctl.parser.node;

import soot.jimple.toolkits.ctl.parser.analysis.*;

@SuppressWarnings("nls")
public final class AIfStatement extends PStatement
{
    private TIf _if_;
    private PBoolExpr _boolExpr_;
    private PGotoStmt _gotoStmt_;

    public AIfStatement()
    {
        // Constructor
    }

    public AIfStatement(
        @SuppressWarnings("hiding") TIf _if_,
        @SuppressWarnings("hiding") PBoolExpr _boolExpr_,
        @SuppressWarnings("hiding") PGotoStmt _gotoStmt_)
    {
        // Constructor
        setIf(_if_);

        setBoolExpr(_boolExpr_);

        setGotoStmt(_gotoStmt_);

    }

    @Override
    public Object clone()
    {
        return new AIfStatement(
            cloneNode(this._if_),
            cloneNode(this._boolExpr_),
            cloneNode(this._gotoStmt_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIfStatement(this);
    }

    public TIf getIf()
    {
        return this._if_;
    }

    public void setIf(TIf node)
    {
        if(this._if_ != null)
        {
            this._if_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._if_ = node;
    }

    public PBoolExpr getBoolExpr()
    {
        return this._boolExpr_;
    }

    public void setBoolExpr(PBoolExpr node)
    {
        if(this._boolExpr_ != null)
        {
            this._boolExpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._boolExpr_ = node;
    }

    public PGotoStmt getGotoStmt()
    {
        return this._gotoStmt_;
    }

    public void setGotoStmt(PGotoStmt node)
    {
        if(this._gotoStmt_ != null)
        {
            this._gotoStmt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._gotoStmt_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._if_)
            + toString(this._boolExpr_)
            + toString(this._gotoStmt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._if_ == child)
        {
            this._if_ = null;
            return;
        }

        if(this._boolExpr_ == child)
        {
            this._boolExpr_ = null;
            return;
        }

        if(this._gotoStmt_ == child)
        {
            this._gotoStmt_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._if_ == oldChild)
        {
            setIf((TIf) newChild);
            return;
        }

        if(this._boolExpr_ == oldChild)
        {
            setBoolExpr((PBoolExpr) newChild);
            return;
        }

        if(this._gotoStmt_ == oldChild)
        {
            setGotoStmt((PGotoStmt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}